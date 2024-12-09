package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.ServicesDto;
import com.dme.ToursProject.dto.StationsDto;
import com.dme.ToursProject.entity.Services;
import com.dme.ToursProject.entity.Stations;
import com.dme.ToursProject.entity.Tours;
import com.dme.ToursProject.repository.ICitiesDao;
import com.dme.ToursProject.repository.IToursDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StationsMapper {
    @Autowired
    private static IToursDao toursDao;
    @Autowired
    private static ICitiesDao citiesDao;

    public StationsMapper(IToursDao toursDao, ICitiesDao citiesDao) {
        this.toursDao = toursDao;
        this.citiesDao = citiesDao;
    }

    public static StationsDto toDto(Stations stations){

        StationsDto stationsDto = new StationsDto();

        stationsDto.setId(stations.getId());
        stationsDto.setName(stations.getName());
        stationsDto.setCityId(stations.getCities().getId());
        stationsDto.setCityName(stations.getCities().getName());

        Set<Long> toursIds = stations.getTours().stream()
                .map(Tours::getId)
                .collect(Collectors.toSet());
        stationsDto.setTourIds(toursIds);

        Set<String> toursTitle = stations.getTours().stream()
                .map(Tours::getTitle)
                .collect(Collectors.toSet());
        stationsDto.setTourTitle(toursTitle);

        Set<String> toursDescription = stations.getTours().stream()
                .map(Tours::getDescription)
                .collect(Collectors.toSet());
        stationsDto.setTourDescription(toursDescription);

        return stationsDto;
    }

    public static Stations toEntity(StationsDto stationsDto){

        Stations stations = new Stations();

        stations.setName(stationsDto.getName());
        stations.setCities(citiesDao.getById(stationsDto.getCityId()));

        Set<Tours> tours = stationsDto.getTourIds().stream()
                .map(toursDao::findById)  // Öğrencileri repository'den bul
                .filter(Optional::isPresent)       // Sadece var olanları al
                .map(Optional::get)                // Optional'ı aç ve Student'ı al
                .collect(Collectors.toSet());
        stations.setTours(tours);

        return stations;

    }
}
