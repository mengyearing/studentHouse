package com.myy.service;

import com.myy.pojo.Student;

public interface StudentService {
	
	boolean findStudentByUserName(String stuUsername,String stuPassword);
	void addStudent(Student student);
	Student findStudentById(String studentId);
    Student findStudentByStudentName(String stuUsername,String stuPassword);
}
