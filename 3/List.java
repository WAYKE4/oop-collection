package com.company;

import java.util.ArrayList;

public class List {
    Student student1 = new Student("Danya", "140401", 4, 5.3);
    Student student2 = new Student("Maxim", "140301", 3, 2.3);
    Student student3 = new Student("Valya", "340402", 1, 6.8);
    Student student4 = new Student("Nadya", "133031", 2, 9);
    Student student5 = new Student("Sergey", "140401", 4, 1.2);

    ArrayList<Student> studentArrayList = new ArrayList<>();

    {
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
    }

    public void CheckStudentRemove(Student student) {
        if (student.averageMark < 3) {
            studentArrayList.remove(student);
            System.out.println("You have been expelled!" + student.name);
        } else {
            System.out.println("You so lucky! " + student.name);
        }
    }

    public void CheckStudentNextCourse(Student student) {
        if (student.courseNumber < 4) {
            if (student.averageMark > 3) {
                student.courseNumber++;
                System.out.println("You've been upgraded at course! " + student.name);
            } else {
                System.out.println("Yours averageMark is not enough! " + student.name);
            }
        } else System.out.println("You already at 4 course! " + student.name);

    }

    public void PrintStudents(ArrayList<Student> studentArrayList, int course) {
        {
            int count = 0;
            System.out.println("People studying at the " +course + " course: ");
            for (int i = 0; i < studentArrayList.size(); i++) {
                if (studentArrayList.get(i).courseNumber == course) {
                    System.out.println(studentArrayList.get(i));
                    count++;
                }
            }
            if (count == 0){
                System.out.println("No one study at this course");
            }
        }
    }
}
