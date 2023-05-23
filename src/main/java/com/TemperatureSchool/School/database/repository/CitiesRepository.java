package com.TemperatureSchool.School.database.repository;

import com.TemperatureSchool.School.database.table.Cities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends CrudRepository <Cities, Long> {
}
