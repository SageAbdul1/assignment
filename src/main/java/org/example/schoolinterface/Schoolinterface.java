package org.example.schoolinterface;

import org.example.entities.Applicants;
import org.example.entities.Principal;
import org.example.entities.Student;
import org.example.entities.Teachers;
import org.example.enums.Courses;

public interface Schoolinterface {// declaration of interface of class called school interface.
    void admit(Principal principal, Applicants applicants);// methods
    void expel(Principal principal, Student student);//methods
    Courses teach(Teachers teachers);//
    //we created interface for services rendered by the school

}
