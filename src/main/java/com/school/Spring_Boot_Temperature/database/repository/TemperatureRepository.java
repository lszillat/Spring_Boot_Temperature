package com.school.Spring_Boot_Temperature.database.repository;

import com.school.Spring_Boot_Temperature.database.table.Temperature;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface TemperatureRepository extends CrudRepository <Temperature, Long> {
    @Query(value = "select * from temperature where city_id = ?1 and (date between ?2 and ?3)", nativeQuery = true)
    Iterable<Temperature> getTemperatureByTimespan(long city, Date start, Date end);
}
