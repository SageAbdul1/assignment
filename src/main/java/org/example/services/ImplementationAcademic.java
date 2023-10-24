package org.example.services;

import org.example.entities.Applicants;
import org.example.entities.Principal;
import org.example.entities.Student;
import org.example.entities.Teachers;
import org.example.schoolinterface.Schoolinterface;

public class ImplementationAcademic implements Schoolinterface {
    @Override
    public void admit(Principal principal, Applicants applicants) {

    }

    @Override
    public void expel(Principal principal, Student student) {

    }

    @Override
    public void teach(Teachers teachers) {

    }
}
