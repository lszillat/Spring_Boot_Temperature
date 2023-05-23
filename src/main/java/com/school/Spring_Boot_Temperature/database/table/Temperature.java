package com.school.Spring_Boot_Temperature.database.table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
public class Temperature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private long id;

    @Setter
    @Getter
    private long city_id;

    @Setter
    @Getter
    private Date date;

    @Setter
    @Getter
    private String timezone;

    @Setter
    @Getter
    private double temperature;
}
