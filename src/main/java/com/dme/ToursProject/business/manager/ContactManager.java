package com.dme.ToursProject.business.manager;

import com.dme.ToursProject.baseClass.BaseClass;
import com.dme.ToursProject.business.service.IContactService;
import com.dme.ToursProject.dto.ContactDto;
import com.dme.ToursProject.mapper.ContactMapper;
import com.dme.ToursProject.repository.IContactDao;
import com.dme.ToursProject.result.Result;
import com.dme.ToursProject.result.SuccesDataResult;
import com.dme.ToursProject.result.SuccesResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactManager extends BaseClass implements IContactService {

    private IContactDao contactDao;

    @Autowired
    public ContactManager(IContactDao contactDao) {
        this.contactDao = contactDao;
    }


    @Override
    public Result sendContact(ContactDto contactDto) {
        contactDao.save(dtoToEntity(contactDto, ContactMapper::toEntity));
        return new SuccesResult("Mesajınız iletildi. En kısa sürede cevap vereceğiz.",true);
    }
}
