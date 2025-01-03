package com.StarkIndustries.SpringCoreModuleMark2.AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Courses {
    @Value("Android Devleopment")
    private String courseName;
    @Value("1 Year")
    private String courseDuration;

    public Courses(String courseName,String courseDuration){
        this.courseName=courseName;
        this.courseDuration=courseDuration;
    }

    public Courses(){

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "CourseName:"+this.getCourseName()+" CourseDepartment:"+this.getCourseDuration();
    }
}
