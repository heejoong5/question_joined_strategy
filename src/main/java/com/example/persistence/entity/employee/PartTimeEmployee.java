package com.example.persistence.entity.employee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by sonsoftheejoongs on 2016-03-07.
 */
@Entity
@DiscriminatorValue("part-time")
public class PartTimeEmployee extends Employee {

    @Column
    private int hourly;

    public int getHourly() {
        return hourly;
    }

    public void setHourly(int hourly) {
        this.hourly = hourly;
    }
}
