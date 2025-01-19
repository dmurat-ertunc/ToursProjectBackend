package com.dme.ToursProject.business.service;

import com.dme.ToursProject.result.Result;

public interface IPlannedToursService {
    Result getById(long id);
    Result getByToursId(long id);
}
