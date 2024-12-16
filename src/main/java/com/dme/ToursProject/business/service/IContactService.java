package com.dme.ToursProject.business.service;

import com.dme.ToursProject.dto.ContactDto;
import com.dme.ToursProject.result.Result;

public interface IContactService {

    Result sendContact(ContactDto contactDto);
}
