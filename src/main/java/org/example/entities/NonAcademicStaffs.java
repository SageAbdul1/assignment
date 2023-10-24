package org.example.entities;

import org.example.enums.Unit;

public class NonAcademicStaffs extends User{
    private Unit unit;

    @Override
    public String toString() {
        return "NonAcademicStaffs{" +
                "unit=" + unit +
                '}';
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
