package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.ToursDto;
import com.dme.ToursProject.entity.Cities;
import com.dme.ToursProject.entity.Services;
import com.dme.ToursProject.entity.Stations;
import com.dme.ToursProject.entity.Tours;
import com.dme.ToursProject.repository.ICitiesDao;
import com.dme.ToursProject.repository.IServicesDao;
import com.dme.ToursProject.repository.IStationsDao;
import com.dme.ToursProject.repository.ITourTimeDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ToursMapper {

    @Autowired
    private static ITourTimeDao tourTimeDao;
    @Autowired
    private static ICitiesDao citiesDao;
    @Autowired
    private static IServicesDao servicesDao;
    @Autowired
    private static IStationsDao stationsDao;

    public ToursMapper(IStationsDao stationsDao, IServicesDao servicesDao, ICitiesDao citiesDao, ITourTimeDao tourTimeDao) {
        this.tourTimeDao=tourTimeDao;
        this.citiesDao=citiesDao;
        this.servicesDao=servicesDao;
        this.stationsDao=stationsDao;
    }

    public static ToursDto toDto(Tours tours){

        ToursDto toursDto = new ToursDto();

        toursDto.setId(tours.getId());
        toursDto.setTitle(tours.getTitle());
        toursDto.setDescription(tours.getDescription());
        toursDto.setPrice(tours.getPrice());
        toursDto.setTourTimeId(tours.getTourTime().getId());
        toursDto.setTourTimeDayNight(tours.getTourTime().getDayNight());
        toursDto.setFoto1(tours.getFoto1());
        toursDto.setFoto2(tours.getFoto2());
        toursDto.setFoto3(tours.getFoto3());

        Set<Long> stationsId = tours.getStations().stream()
                .map(Stations::getId)
                .collect(Collectors.toSet());
        toursDto.setStationId(stationsId);

        Set<String> stationsName = tours.getStations().stream()
                .map(Stations::getName)
                .collect(Collectors.toSet());
        toursDto.setStationName(stationsName);

        Set<Long> cityId = tours.getCities().stream()
                .map(Cities::getId)
                .collect(Collectors.toSet());
        toursDto.setCityId(cityId);

        Set<String> cityName = tours.getCities().stream()
                .map(Cities::getName)
                .collect(Collectors.toSet());
        toursDto.setCityName(cityName);

        Set<Long> serviceId = tours.getServices().stream()
                .map(Services::getId)
                .collect(Collectors.toSet());
        toursDto.setServiceId(serviceId);

        Set<String> serviceName = tours.getServices().stream()
                .map(Services::getName)
                .collect(Collectors.toSet());
        toursDto.setServiceName(serviceName);

        return toursDto;
    }

    public static Tours toEntity(ToursDto toursDto){

        Tours tours = new Tours();

        tours.setTitle(toursDto.getTitle());
        tours.setDescription(toursDto.getDescription());
        tours.setPrice(toursDto.getPrice());
        tours.setTourTime(tourTimeDao.getById(toursDto.getTourTimeId()));
        tours.setFoto1(toursDto.getFoto1());
        tours.setFoto2(toursDto.getFoto2());
        tours.setFoto3(toursDto.getFoto3());

        Set<Stations> stations = toursDto.getStationId().stream()
                .map(stationsDao::findById)  // Öğrencileri repository'den bul
                .filter(Optional::isPresent)       // Sadece var olanları al
                .map(Optional::get)                // Optional'ı aç ve Student'ı al
                .collect(Collectors.toSet());
        tours.setStations(stations);

        Set<Services> services = toursDto.getServiceId().stream()
                .map(servicesDao::findById)  // Öğrencileri repository'den bul
                .filter(Optional::isPresent)       // Sadece var olanları al
                .map(Optional::get)                // Optional'ı aç ve Student'ı al
                .collect(Collectors.toSet());
        tours.setServices(services);

        Set<Cities> cities = toursDto.getCityId().stream()
                .map(citiesDao::findById)  // Öğrencileri repository'den bul
                .filter(Optional::isPresent)       // Sadece var olanları al
                .map(Optional::get)                // Optional'ı aç ve Student'ı al
                .collect(Collectors.toSet());
        tours.setCities(cities);

        return tours;

    }
}
