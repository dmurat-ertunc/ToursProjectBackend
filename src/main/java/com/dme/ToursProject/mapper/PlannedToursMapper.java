package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.PlannedToursDto;
import com.dme.ToursProject.entity.PlannedTours;
import com.dme.ToursProject.repository.IToursDao;
import org.springframework.beans.factory.annotation.Autowired;

public class PlannedToursMapper {
    @Autowired
    private static IToursDao toursDao;

    public PlannedToursMapper(IToursDao toursDao){
        this.toursDao = toursDao;
    }

    public static PlannedToursDto toDto(PlannedTours plannedTours){

        PlannedToursDto plannedToursDto = new PlannedToursDto();

        plannedToursDto.setId(plannedTours.getId());
        plannedToursDto.setStartDate(plannedTours.getStartDate());
        plannedToursDto.setStartTime(plannedTours.getStartTime());
        plannedToursDto.setStartLocation(plannedTours.getStartLocation());
        plannedToursDto.setToursId(plannedTours.getTours().getId());
        plannedToursDto.setToursDescription(plannedTours.getTours().getDescription());
        plannedToursDto.setToursTitle(plannedTours.getTours().getTitle());
        plannedToursDto.setQuota(plannedTours.getQuota());

        return plannedToursDto;
    }
    public static PlannedTours toEntity(PlannedToursDto plannedToursDto){

        PlannedTours plannedTours = new PlannedTours();

        plannedTours.setStartDate(plannedToursDto.getStartDate());
        plannedTours.setStartLocation(plannedToursDto.getStartLocation());
        plannedTours.setStartTime(plannedToursDto.getStartTime());
        plannedTours.setQuota(plannedToursDto.getQuota());
        plannedTours.setTours(toursDao.getById(plannedToursDto.getToursId()));

        return plannedTours;
    }
}
