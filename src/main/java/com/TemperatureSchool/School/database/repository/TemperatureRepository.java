package com.TemperatureSchool.School.database.repository;

import com.TemperatureSchool.School.database.table.Temperature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureRepository extends CrudRepository <Temperature, Long> {
}
