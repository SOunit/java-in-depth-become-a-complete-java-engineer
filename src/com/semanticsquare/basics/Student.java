package com.semanticsquare.basics;

class Student {
    static int studentCount;

    private int id;
    String name;
    String gender;
    int age;
    private long phone;
    double gpa;
    char degree;

    boolean international;
    double tuitionFee = 12000.0;
    double internationalFee = 5000.0;

    Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree) {
        this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);
    }

    Student(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree,
            boolean international) {
        this.id = newId;
        this.name = newName;
        this.gender = newGender;
        this.age = newAge;
        this.phone = newPhone;
        this.gpa = newGpa;
        this.degree = newDegree;
        this.international = international;

        studentCount += 1;

        if (international) {
            tuitionFee = tuitionFee + internationalFee;
        }
    }

    Student() {
    }

    boolean equals(Student s) {
        return s.id == id;
    }

}
