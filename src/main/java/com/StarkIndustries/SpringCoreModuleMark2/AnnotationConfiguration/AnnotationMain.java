package com.StarkIndustries.SpringCoreModuleMark2.AnnotationConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.StarkIndustries.SpringCoreModuleMark2.AnnotationConfiguration")
public class AnnotationMain {

    @Bean
    public Courses getCourses(){
        return new Courses("Full Stack Java Developer","1 Year");
    }

    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

//        System.out.println(context.getBean("Name"));
//        System.out.println(context.getBean("Age"));
//        System.out.println(context.getBean("Person1"));
//        System.out.println(context.getBean("Address"));
//        System.out.println(context.getBean("Person3"));

        // printing number of beans managed by beans

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

//        var context = new ClassPathXmlApplicationContext("com/StarkIndustries/SpringCoreModuleMark2/AnnotationConfiguration/configuration.xml");
//        Student student = context.getBean(Student.class);
//        student.getMajors().stream().forEach(value->{
//            System.out.println(value+" ");
//        });
        
        // Getting Bean of @Components

        var context = new AnnotationConfigApplicationContext(AnnotationMain.class);
//        Demo demo = context.getBean(Demo.class);
//        System.out.println(demo);
//        Employee employee = context.getBean(Employee.class);
//        System.out.println(employee);
//        Student student = context.getBean(Student.class);
//        System.out.println(student);

        // Getting Beans of @Bean
//        System.out.println(context.getBean("getName"));
//        System.out.println(context.getBean("getAge"));
//        System.out.println(context.getBean("Person2"));
        System.out.println(context.getBean(Employee.class));
    }
}
