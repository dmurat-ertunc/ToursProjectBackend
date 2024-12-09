package com.dme.ToursProject.mapper;

import com.dme.ToursProject.dto.TicketSoldDto;
import com.dme.ToursProject.entity.TicketSold;
import com.dme.ToursProject.repository.IPlannedToursDao;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketSoldMapper {

    @Autowired
    private static IPlannedToursDao plannedToursDao;

    public TicketSoldMapper(IPlannedToursDao plannedToursDao) {
        this.plannedToursDao = plannedToursDao;
    }

    public static TicketSoldDto toDto(TicketSold ticketSold){

        TicketSoldDto ticketSoldDto = new TicketSoldDto();

        ticketSoldDto.setId(ticketSold.getId());
        ticketSoldDto.setName(ticketSold.getName());
        ticketSoldDto.setSurname(ticketSold.getSurname());
        ticketSoldDto.setEmail(ticketSold.getEmail());
        ticketSoldDto.setPhoneNumber(ticketSold.getPhoneNumber());
        ticketSoldDto.setIdentityNumber(ticketSold.getIdentityNumber());
        ticketSoldDto.setPnrNo(ticketSold.getPnrNo());
        ticketSoldDto.setPlannedToursId(ticketSold.getPlannedTours().getId());
        ticketSoldDto.setPlannedTourTitle(ticketSold.getPlannedTours().getTours().getTitle());
        ticketSoldDto.setPlannedTourTitle(ticketSold.getPlannedTours().getTours().getTitle());

        return ticketSoldDto;
    }

    public static TicketSold toEntity(TicketSoldDto ticketSoldDto){

        TicketSold ticketSold = new TicketSold();

        ticketSold.setName(ticketSoldDto.getName());
        ticketSold.setSurname(ticketSoldDto.getSurname());
        ticketSold.setEmail(ticketSoldDto.getEmail());
        ticketSold.setPhoneNumber(ticketSoldDto.getPhoneNumber());
        ticketSold.setIdentityNumber(ticketSoldDto.getIdentityNumber());
        ticketSold.setPnrNo(ticketSoldDto.getPnrNo());
        ticketSold.setPlannedTours(plannedToursDao.getById(ticketSoldDto.getPlannedToursId()));

        return ticketSold;
    }
}
