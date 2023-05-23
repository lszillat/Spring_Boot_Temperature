package com.school.Spring_Boot_Temperature.database.repository;

import com.school.Spring_Boot_Temperature.database.table.Temperature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureRepository extends CrudRepository <Temperature, Long> {
}
