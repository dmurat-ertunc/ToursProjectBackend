package com.dme.ToursProject.business.service;

import com.dme.ToursProject.result.Result;

public interface IToursService {
    Result getAll();
    Result getById(Long id);
}
