package com.dme.ToursProject.controller;

import com.dme.ToursProject.business.service.IPlannedToursService;
import com.dme.ToursProject.repository.IPlannedToursDao;
import com.dme.ToursProject.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/plannedTours")
public class PlannedToursController {

    private IPlannedToursService plannedToursService;

    @Autowired
    public PlannedToursController(IPlannedToursService plannedToursService){this.plannedToursService = plannedToursService;}

    @GetMapping("getById/{id}")
    public Result getById(@PathVariable Long id){
        return this.plannedToursService.getById(id);
    }

    @GetMapping("getByToursId/{id}")
    public Result getByToursId(@PathVariable Long id){
        return this.plannedToursService.getByToursId(id);
    }
}
