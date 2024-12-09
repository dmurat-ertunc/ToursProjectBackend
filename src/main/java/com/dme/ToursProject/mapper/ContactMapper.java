package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.ContactDto;
import com.dme.ToursProject.entity.Contact;

public class ContactMapper {

    public static ContactDto toDto(Contact contact){
        ContactDto contactDto = new ContactDto();

        contactDto.setId(contact.getId());
        contactDto.setName(contact.getName());
        contactDto.setSurname(contact.getSurname());
        contactDto.setSubject(contact.getSubject());
        contactDto.setMessage(contact.getMessage());
        contactDto.setEmail(contact.getEmail());
        contactDto.setPhoneNumber(contact.getPhoneNumber());

        return contactDto;
    }

    public static Contact toEntity(ContactDto contactDto){
        Contact contact = new Contact();

        contact.setName(contactDto.getName());
        contact.setSurname(contactDto.getSurname());
        contact.setSubject(contactDto.getSubject());
        contact.setMessage(contactDto.getMessage());
        contact.setEmail(contactDto.getEmail());
        contact.setPhoneNumber(contact.getPhoneNumber());

        return contact;
    }
}
