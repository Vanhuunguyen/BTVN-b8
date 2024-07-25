package BTVN_b8;

import java.awt.geom.GeneralPath;

abstract class Student {
    String StudentID;
    String name;
    int age;

    public Student(String studentld, String name, int age) {
        StudentID = studentld;
        this.name = name;
        this.age = age;
    }

    public abstract double caculateGPA();

    public void studentInfor() {
        System.out.println(StudentID+" " +"" +name + "" + age);
    }
}
