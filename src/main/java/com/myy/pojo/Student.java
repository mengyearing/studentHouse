package com.myy.pojo;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
public class Student implements Serializable {
    private String studentid;
     
    @Size(min=3,max=6)
    private String studentusername;

    @Size(min=3,max=6)
    private String studentpassword;

    @Size(min=11,max=11)
    private String studentphone;

    private String studentsex;

    @Email
    @NotEmpty
    private String studentemail;

    private String studentchecked;

    private static final long serialVersionUID = 1L;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentusername() {
        return studentusername;
    }

    public void setStudentusername(String studentusername) {
        this.studentusername = studentusername;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
    }

    public String getStudentphone() {
        return studentphone;
    }

    public void setStudentphone(String studentphone) {
        this.studentphone = studentphone;
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    public String getStudentchecked() {
        return studentchecked;
    }

    public void setStudentchecked(String studentchecked) {
        this.studentchecked = studentchecked;
    }
}