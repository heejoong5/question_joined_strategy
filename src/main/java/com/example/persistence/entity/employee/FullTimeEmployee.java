package com.example.persistence.entity.employee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by sonsoftheejoongs on 2016-03-07.
 */
@Entity
@DiscriminatorValue("full-time")
public class FullTimeEmployee extends Employee {

    @Column
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
