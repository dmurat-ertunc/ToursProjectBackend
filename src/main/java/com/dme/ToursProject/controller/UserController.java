package com.dme.ToursProject.controller;

import com.dme.ToursProject.business.service.IUserService;
import com.dme.ToursProject.dto.LoginDto;
import com.dme.ToursProject.dto.RegisterDto;
import com.dme.ToursProject.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/session")
public class UserController {

    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("login")
    public Result signIn(@RequestBody LoginDto loginDto){
        return this.userService.signIn(loginDto);
    }

    @PostMapping("register")
    public Result signUp(@RequestBody RegisterDto registerDto){
        return this.userService.signUp(registerDto);
    }
}
