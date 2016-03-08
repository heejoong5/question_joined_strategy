package com.example.persistence.entity;

import com.example.persistence.entity.employee.FullTimeEmployee;
import com.example.persistence.id.PromotionFullTimeEmployeeId;

import javax.persistence.*;

/**
 * Created by sonsoftheejoongs on 2016-03-08.
 */
@Entity
@IdClass(PromotionFullTimeEmployeeId.class)
public class PromotionFullTimeEmployee {

    @Id
    @ManyToOne
    private Promotion promotion;

    @Id
    @ManyToOne
    private FullTimeEmployee fullTimeEmployee;

    @Column
    private String beforeRank;

    @Column
    private String afterRank;

    @Column
    private String memo;

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public FullTimeEmployee getFullTimeEmployee() {
        return fullTimeEmployee;
    }

    public void setFullTimeEmployee(FullTimeEmployee fullTimeEmployee) {
        this.fullTimeEmployee = fullTimeEmployee;
    }

    public String getBeforeRank() {
        return beforeRank;
    }

    public void setBeforeRank(String beforeRank) {
        this.beforeRank = beforeRank;
    }

    public String getAfterRank() {
        return afterRank;
    }

    public void setAfterRank(String afterRank) {
        this.afterRank = afterRank;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
