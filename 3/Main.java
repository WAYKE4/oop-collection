package com.company;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        for (Student students : list.studentArrayList) {
            System.out.println(students);
        }
        list.CheckStudentNextCourse(list.student1);
        list.CheckStudentNextCourse(list.student2);
        list.CheckStudentNextCourse(list.student3);
        list.CheckStudentRemove(list.student3);
        list.CheckStudentRemove(list.student4);
        list.CheckStudentRemove(list.student5);
        for (Student students : list.studentArrayList) {
            System.out.println(students);
        }
        list.PrintStudents(list.studentArrayList , 3);
    }
}
