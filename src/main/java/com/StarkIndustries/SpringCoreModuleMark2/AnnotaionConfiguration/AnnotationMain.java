package com.StarkIndustries.SpringCoreModuleMark2.AnnotaionConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AnnotationMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

//        System.out.println(context.getBean("Name"));
//        System.out.println(context.getBean("Age"));
//        System.out.println(context.getBean("Person1"));
//        System.out.println(context.getBean("Address"));
        System.out.println(context.getBean("Person3"));

        // printing number of beans managed by beans

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
