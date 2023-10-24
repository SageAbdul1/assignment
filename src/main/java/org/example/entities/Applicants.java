package org.example.entities;

public class Applicants extends User {
    public Long applicationNo;
    public Long yearOfApplication;
    public int age;

    @Override
    public String toString() {
        return "Applicants{" +
                "applicationNo=" + applicationNo +
                ", yearOfApplication=" + yearOfApplication +
                '}';
    }

    public Long getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(Long applicationNo) {
        this.applicationNo = applicationNo;
    }

    public Long getYearOfApplication() {
        return yearOfApplication;
    }

    public void setYearOfApplication(Long yearOfApplication) {
        this.yearOfApplication = yearOfApplication;

    }

    public void ApplicationStatus(){

        if (age < 50) {
            System.out.println("congratulations you are hired");

        } else {
            System.out.println("you are hired not hired");
            }
        }

    public static void main(String[] args) {
        Applicants applicants= new Applicants();
        applicants.setAge(30);
        applicants.ApplicationStatus();

    }

    }


