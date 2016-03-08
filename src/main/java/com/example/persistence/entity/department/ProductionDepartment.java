package com.example.persistence.entity.department;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by sonsoftheejoongs on 2016-03-07.
 */
@Entity
@DiscriminatorValue("production")
public class ProductionDepartment extends Department{

    @Column
    private int output;

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
