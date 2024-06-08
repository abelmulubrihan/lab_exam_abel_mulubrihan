package com.itsc.labExam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    StudentRepo studentRepo = (StudentRepo) context.getBean("studentRepo");

    studentRepo.createDBAndTable();

    Student student = new Student(1, "student 1", "student1@gmail.com");
    studentRepo.insertIntoTable(student);
  }
}
