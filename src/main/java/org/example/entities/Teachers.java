package org.example.entities;

import org.example.enums.Courses;

public class Teachers extends User{
    private Courses coursesTaken;

    @Override
    public String toString() {
        return "Teachers{" +
                "coursesTaken=" + coursesTaken +
                '}';
    }

    public Courses getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Courses coursesTaken) {
        this.coursesTaken = coursesTaken;
    }


}
