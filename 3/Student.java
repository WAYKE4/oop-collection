package com.company;

public class Student {
    public String name;
    public String nameOfGroup;
    public int courseNumber;
    public double averageMark;

    public Student(String name, String nameOfGroup, int courseNumber, double averageMark) {
        this.name = name;
        this.nameOfGroup = nameOfGroup;
        this.courseNumber = courseNumber;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                ", courseNumber=" + courseNumber +
                ", averageMark=" + averageMark +
                '}';
    }
}
