package com.StarkIndustries.SpringCoreModuleMark2.AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("2021FHCO042")
    private String empId;
    @Value("Aditya")
    private String name;
    @Value("Full Stack Java Developer")
    private String department;

    public Employee(String empId,String name,String department){
        this.empId=empId;
        this.name=name;
        this.department=department;
    }

    public Employee(){

    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    @Override
    public String toString() {
        return "empId:"+this.getEmpId()+" Name:"+this.getName()+" Department:"+this.getDepartment();
    }
}
