package org.example.entities;

public class Principal extends User{
    private String professionalLevel;

    public String getProfessionalLevel() {
        return professionalLevel;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "professionalLevel='" + professionalLevel + '\'' +
                '}';
    }

    public void setProfessionalLevel(String professionalLevel) {
        this.professionalLevel = professionalLevel;
    }
}
