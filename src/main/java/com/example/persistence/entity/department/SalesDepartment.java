package com.example.persistence.entity.department;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by sonsoftheejoongs on 2016-03-07.
 */
@Entity
@DiscriminatorValue("sales")
public class SalesDepartment extends Department {

    @Column
    private int orders;

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
}
