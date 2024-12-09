package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.TourTimeDto;
import com.dme.ToursProject.entity.TourTime;

public class TourTimeMapper {

    public static TourTimeDto toDto(TourTime tourTime){

        TourTimeDto tourTimeDto = new TourTimeDto();

        tourTimeDto.setId(tourTime.getId());
        tourTimeDto.setDayNight(tourTime.getDayNight());

        return tourTimeDto;
    }

    public static TourTime toEntity(TourTimeDto tourTimeDto){

        TourTime tourTime = new TourTime();

        tourTime.setDayNight(tourTimeDto.getDayNight());

        return tourTime;
    }
}
