package com.example.persistence.entity.department;

import javax.persistence.*;

/**
 * Created by sonsoftheejoongs on 2016-03-07.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
