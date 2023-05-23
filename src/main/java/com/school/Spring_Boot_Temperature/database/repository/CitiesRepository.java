package com.school.Spring_Boot_Temperature.database.repository;

import com.school.Spring_Boot_Temperature.database.table.Cities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends CrudRepository <Cities, Long> {
}
