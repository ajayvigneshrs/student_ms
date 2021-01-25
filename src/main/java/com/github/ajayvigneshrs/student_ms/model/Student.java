package com.github.ajayvigneshrs.student_ms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Table(name="students")
@Entity
public class Student {
    @Id
    String id;
    String name;
    String department;
    Date dateOfBirth;
    String semester;
    Integer phoneNum;
    String emailId;
    String bloodGroup;
    String adviserId;
    public Student(){}
    public Student(String id, String name, String department, Date dateOfBirth, String semester, Integer phoneNum, String emailId, String bloodGroup, String adviserId) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.semester = semester;
        this.phoneNum = phoneNum;
        this.emailId = emailId;
        this.bloodGroup = bloodGroup;
        this.adviserId = adviserId;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdviserId() {
        return adviserId;
    }

    public void setAdviserId(String adviserId) {
        this.adviserId = adviserId;
    }



}
