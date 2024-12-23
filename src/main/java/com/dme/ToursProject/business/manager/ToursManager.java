package com.dme.ToursProject.business.manager;

import com.dme.ToursProject.baseClass.BaseClass;
import com.dme.ToursProject.business.service.IToursService;
import com.dme.ToursProject.dto.ToursDto;
import com.dme.ToursProject.mapper.ToursMapper;
import com.dme.ToursProject.repository.IToursDao;
import com.dme.ToursProject.result.ErrorResult;
import com.dme.ToursProject.result.Result;
import com.dme.ToursProject.result.SuccesDataResult;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ToursManager extends BaseClass implements IToursService {

    private IToursDao toursDao;

    @Autowired
    public ToursManager(IToursDao toursDao) {
        this.toursDao = toursDao;
    }

    @Transactional
    @Override
    public Result getAll(){
        List<ToursDto> toursDtoList = entityToDtoList(toursDao.findAll(), ToursMapper::toDto);
        return new SuccesDataResult("Listelendi",true,toursDtoList);
    }
    @Transactional
    @Override
    public Result getById(Long id) {
        try {
            ToursDto toursDto = entityToDto(toursDao.getById(id), ToursMapper::toDto);
            return new SuccesDataResult("Listeleme başarılı",true,toursDto);
        } catch (Exception e) {
            return new ErrorResult("Bu id değerine göre tur bulunamadı",false);
        }
    }
}
