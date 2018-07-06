package com.myy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myy.mapper.StudentMapper;
import com.myy.pojo.Student;
import com.myy.pojo.StudentExample;
import com.myy.pojo.StudentExample.Criteria;
import com.myy.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
    
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public boolean findStudentByUserName(String stuUsername, String stuPassword) {
        StudentExample example=new StudentExample();
        Criteria criteria=example.createCriteria();
        criteria.andStudentusernameEqualTo(stuUsername);
       
        criteria.andStudentpasswordEqualTo(stuPassword);
        List<Student> list=new ArrayList<Student>();
        list = studentMapper.selectByExample(example);
        if(!list.isEmpty()) {
        	return true;
        }else {
    		return false;
        }

	}

	@Override
	public void addStudent(Student student) {
		long currentTimeMillis = System.currentTimeMillis();
	  String stuUserId=currentTimeMillis+"";	
      student.setStudentid(stuUserId);
      student.setStudentpassword(DigestUtils.md5Hex(student.getStudentpassword()));
      studentMapper.insert(student);

	}

	@Override
	public Student findStudentByStudentName(String stuUsername, String stuPassword) {
        StudentExample example=new StudentExample();
        Criteria criteria=example.createCriteria();
        criteria.andStudentusernameEqualTo(stuUsername);
        criteria.andStudentpasswordEqualTo(stuPassword);
        List<Student> list=new ArrayList<Student>();
        list = studentMapper.selectByExample(example);
        if(!list.isEmpty()) {
        	return list.get(0);
        }
		return null;
	}

	@Override
	public Student findStudentById(String studentId) {
		
		return studentMapper.selectByPrimaryKey(studentId);

	}

}
