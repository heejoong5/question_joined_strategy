package com.example.persistence.id;

import java.io.Serializable;

public class PromotionFullTimeEmployeeId implements Serializable {

    private int promotion;
    private int fullTimeEmployee;

    public PromotionFullTimeEmployeeId() {}
    public PromotionFullTimeEmployeeId(int promotion, int fullTimeEmployee) {
        this.promotion = promotion;
        this.fullTimeEmployee = fullTimeEmployee;
    }

    public int getPromotion() {
        return promotion;
    }

    public int getFullTimeEmployee() {
        return fullTimeEmployee;
    }

    @Override
    public int hashCode() {
        return promotion + fullTimeEmployee;
    }

    @Override
    public boolean equals(Object obj) {
        return (
            (obj instanceof PromotionFullTimeEmployeeId)
            && promotion == ((PromotionFullTimeEmployeeId) obj).getPromotion()
            && fullTimeEmployee == ((PromotionFullTimeEmployeeId) obj).getFullTimeEmployee()
        );
    }
}
