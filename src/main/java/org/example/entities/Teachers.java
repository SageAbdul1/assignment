package org.example.entities;

import org.example.enums.courses;

public class Teachers extends User{
    private courses coursesTaken;

    @Override
    public String toString() {
        return "Teachers{" +
                "coursesTaken=" + coursesTaken +
                '}';
    }

    public courses getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(courses coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
