package com.dme.ToursProject.business.service;

import com.dme.ToursProject.dto.LoginDto;
import com.dme.ToursProject.dto.RegisterDto;
import com.dme.ToursProject.result.Result;

public interface IUserService {

    Result signUp(RegisterDto registerDto);
    Result signIn(LoginDto loginDto);

}
