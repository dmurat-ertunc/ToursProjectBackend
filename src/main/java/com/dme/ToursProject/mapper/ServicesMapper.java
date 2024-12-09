package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.ServicesDto;
import com.dme.ToursProject.entity.Services;
import com.dme.ToursProject.entity.Tours;
import com.dme.ToursProject.repository.IToursDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ServicesMapper {

    @Autowired
    private static IToursDao toursDao;

    public ServicesMapper(IToursDao toursDao) {
        this.toursDao = toursDao;
    }

    public static ServicesDto toDto(Services services){

        ServicesDto servicesDto = new ServicesDto();

        servicesDto.setId(services.getId());
        servicesDto.setName(services.getName());

        Set<Long> toursIds = services.getTours().stream()
                .map(Tours::getId)
                .collect(Collectors.toSet());
        servicesDto.setToursId(toursIds);

        Set<String> toursTitle = services.getTours().stream()
                .map(Tours::getTitle)
                .collect(Collectors.toSet());
        servicesDto.setTourTitle(toursTitle);

        Set<String> toursDescription = services.getTours().stream()
                .map(Tours::getDescription)
                .collect(Collectors.toSet());
        servicesDto.setTourDescription(toursDescription);

        return servicesDto;
    }

    public static Services toEntity(ServicesDto servicesDto){

        Services services = new Services();

        services.setName(servicesDto.getName());

        Set<Tours> tours = servicesDto.getToursId().stream()
                .map(toursDao::findById)  // Öğrencileri repository'den bul
                .filter(Optional::isPresent)       // Sadece var olanları al
                .map(Optional::get)                // Optional'ı aç ve Student'ı al
                .collect(Collectors.toSet());
        services.setTours(tours);

        return services;
    }
}
