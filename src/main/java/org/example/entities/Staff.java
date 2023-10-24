package org.example.entities;

import java.math.BigDecimal;

public class Staff extends User {
    private BigDecimal Salary;
    private double yearsOfExperience;

    @Override
    public String toString() {
        return "Staff{" +
                "Salary=" + Salary +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    public BigDecimal getSalary() {
        return Salary;
    }

    public void setSalary(BigDecimal salary) {
        Salary = salary;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
