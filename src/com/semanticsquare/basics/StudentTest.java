package com.semanticsquare.basics;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "John", "male", 18, 223_22_2222, 3.8, 'B');
        Student student2 = new Student(1002, "John", "male", 18, 223_22_2222, 3.8, 'B');
        Student student3 = new Student(1003, "John", "male", 18, 223_22_2222, 3.8, 'B');

        System.out.println("Student.studentCount: " + Student.studentCount);

        Student student4 = new Student(1004, "John", "male", 18, 223_22_2222, 3.8, 'B');

        boolean isDuplicate = student3.equals(student3);
        System.out.println("isDuplicate: " + isDuplicate);
    }

}
