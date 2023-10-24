package org.example.entities;

public class Student {
    private String studentClass;
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentClass='" + studentClass + '\'' +
                '}';
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    public void expulsion() {


        if (mark < 50) {
            System.out.println("YOU ARE EXPELLED");
            ;
        } else {
            System.out.println("YOU ARE NOT EXPELLED");
        }





    }


    public static void main(String[] args) {
        Student student = new Student();
        student.setMark(40);
        student.expulsion();
    }
}


