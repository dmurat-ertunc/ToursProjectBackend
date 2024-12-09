package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.CitiesDto;
import com.dme.ToursProject.entity.Cities;
import com.dme.ToursProject.entity.Tours;
import com.dme.ToursProject.repository.IToursDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CitiesMapper {

    @Autowired
    private static IToursDao toursDao;

    public CitiesMapper(IToursDao toursDao) {
        this.toursDao = toursDao;
    }

    public static CitiesDto toDto(Cities cities){

        if (cities == null){
            return null;
        }

        CitiesDto citiesDto = new CitiesDto();

        citiesDto.setId(cities.getId());
        citiesDto.setName(cities.getName());

        Set<Long> toursIds = cities.getTours().stream()
                .map(Tours::getId)
                .collect(Collectors.toSet());
        citiesDto.setTourIds(toursIds);

        Set<String> toursTitle = cities.getTours().stream()
                .map(Tours::getTitle)
                .collect(Collectors.toSet());
        citiesDto.setTourTitle(toursTitle);

        Set<String> toursDescription = cities.getTours().stream()
                .map(Tours::getDescription)
                .collect(Collectors.toSet());
        citiesDto.setTourDescription(toursDescription);

        return citiesDto;
    }

    public static Cities toEntity(CitiesDto citiesDto){

        if (citiesDto == null){
            return null;
        }

        Cities cities = new Cities();

        cities.setName(citiesDto.getName());

        // Üniversite ID'lerini setlemek için
        Set<Tours> tours = citiesDto.getTourIds().stream()
                .map(toursDao::findById)  // Öğrencileri repository'den bul
                .filter(Optional::isPresent)       // Sadece var olanları al
                .map(Optional::get)                // Optional'ı aç ve Student'ı al
                .collect(Collectors.toSet());

        cities.setTours(tours);


        return cities;
    }
}
