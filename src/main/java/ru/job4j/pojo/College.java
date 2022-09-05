package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Bob");
        student.setGroup("402d");
        student.setAdmissionDate(new Date(2002, 9, 1));
        System.out.println("Full name: " + student.getFullName() + ". Group: " + student.getGroup() + ". Admission date: " + student.getAdmissionDate());
    }
}
