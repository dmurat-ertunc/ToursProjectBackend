package com.dme.ToursProject.controller;

import com.dme.ToursProject.business.service.IToursService;
import com.dme.ToursProject.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tours")
public class ToursController {

    private IToursService toursService;

    @Autowired
    public ToursController(IToursService toursService) {
        this.toursService = toursService;
    }

    @GetMapping("getAll")
    public Result getAll(){
        return this.toursService.getAll();
    }
    @GetMapping("getById/{id}")
    public Result getById(@PathVariable  Long id){
        return this.toursService.getById(id);
    }
}
