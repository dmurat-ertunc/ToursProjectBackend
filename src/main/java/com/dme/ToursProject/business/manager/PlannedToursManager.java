package com.dme.ToursProject.business.manager;

import com.dme.ToursProject.baseClass.BaseClass;
import com.dme.ToursProject.business.service.IPlannedToursService;
import com.dme.ToursProject.dto.PlannedToursDto;
import com.dme.ToursProject.entity.PlannedTours;
import com.dme.ToursProject.mapper.PlannedToursMapper;
import com.dme.ToursProject.repository.IPlannedToursDao;
import com.dme.ToursProject.result.ErrorResult;
import com.dme.ToursProject.result.Result;
import com.dme.ToursProject.result.SuccesDataResult;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlannedToursManager extends BaseClass implements IPlannedToursService {
    private IPlannedToursDao plannedToursDao;

    @Autowired
    public PlannedToursManager(IPlannedToursDao plannedToursDao) {
        this.plannedToursDao = plannedToursDao;
    }
    @Transactional
    @Override
    public Result getById(long id) {
        try {
            PlannedToursDto plannedToursDto = entityToDto(plannedToursDao.getById(id), PlannedToursMapper::toDto);
            return new SuccesDataResult("Listeleme başarılı",true,plannedToursDto);
        } catch (Exception e) {
            return new ErrorResult("Bu id değerine göre tur bulunamadı",false);
        }
    }

    @Override
    public Result getByToursId(long id) {
        try {
            List<PlannedTours> plannedTour = plannedToursDao.getByToursId(id);
            if (plannedTour == null) {
                return new ErrorResult("Bu id değerine göre tur bulunamadı", false);
            }
            List<PlannedToursDto> plannedToursDto = entityToDtoList(plannedTour, PlannedToursMapper::toDto);
            return new SuccesDataResult("Listeleme başarılı", true, plannedToursDto);

        } catch (Exception e) {
            return new ErrorResult("Bu id değerine göre tur bulunamadı",false);
        }
    }
}
