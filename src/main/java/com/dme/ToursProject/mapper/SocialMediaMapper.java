package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.SociaMediaDto;
import com.dme.ToursProject.entity.SocialMedia;

public class SocialMediaMapper {

    public static SociaMediaDto toDto(SocialMedia socialMedia){

        SociaMediaDto sociaMediaDto = new SociaMediaDto();

        sociaMediaDto.setId(socialMedia.getId());
        sociaMediaDto.setInstagram(socialMedia.getInstagram());
        sociaMediaDto.setFacebook(socialMedia.getFacebook());
        sociaMediaDto.setTwitter(socialMedia.getTwitter());
        sociaMediaDto.setEmail(socialMedia.getEmail());
        sociaMediaDto.setPhoneNumber(socialMedia.getPhoneNumber());

        return sociaMediaDto;
    }

    public static SocialMedia toEntity(SociaMediaDto sociaMediaDto){

        SocialMedia socialMedia = new SocialMedia();

        socialMedia.setInstagram(sociaMediaDto.getInstagram());
        socialMedia.setFacebook(sociaMediaDto.getFacebook());
        socialMedia.setTwitter(sociaMediaDto.getTwitter());
        socialMedia.setEmail(sociaMediaDto.getEmail());
        socialMedia.setPhoneNumber(sociaMediaDto.getPhoneNumber());

        return socialMedia;
    }
}
