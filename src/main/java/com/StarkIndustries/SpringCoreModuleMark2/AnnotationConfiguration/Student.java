package com.StarkIndustries.SpringCoreModuleMark2.AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student")
public class Student {

    @Value("2021FHCO042")
    private String sid;
    @Value("Aditya")
    private String name;
    @Value("Computer")
    private String department;
    @Value("54")
    private int rollNo;
//    @Value("#{majorsList}")
//    private List<String> majors;
//
//
//    public List<String> getMajors() {
//        return majors;
//    }
//
//    public void setMajors(List<String> majors) {
//        this.majors = majors;
//    }


    public Student(String sid,String name,int rollNo,String department){
        this.sid=sid;
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }

    public Student(String name,int rollNo,String department){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }

    public Student(){

    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "The name of the Student is:"+this.getName();
    }
}
