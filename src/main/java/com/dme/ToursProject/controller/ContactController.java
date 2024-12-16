package com.dme.ToursProject.controller;

import com.dme.ToursProject.business.service.IContactService;
import com.dme.ToursProject.dto.CommentsDto;
import com.dme.ToursProject.dto.ContactDto;
import com.dme.ToursProject.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/contact")
public class ContactController {

    private IContactService contactService;

    @Autowired
    public ContactController(IContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("sendContact")
    public Result sendContact(@RequestBody ContactDto contactDto){
        return this.contactService.sendContact(contactDto);
    }
}
