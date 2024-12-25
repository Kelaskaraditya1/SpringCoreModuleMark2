package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.UsingSpringFrameWork;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
         context.getBean("GamingConsole",GamingConsole.class).down();

    }
}
