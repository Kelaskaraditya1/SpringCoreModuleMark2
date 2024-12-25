package com.StarkIndustries.SpringCoreModuleMark2.AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*This class is similar to configuration.xml for defining the beans*/

record Person(String name,int age,Address address){};
record Address(String country,String state,String city){};

@Configuration
public class BeanConfiguration {

    @Bean(name = "getName")
    public String getName(){
        return "Mayur";
    }

    @Bean(name = "getAge")
    public int getAge(){
        return 69;
    }

    @Primary
    @Bean(name = "Person1")
    public Person getPerson(){
        var person = new Person("Aditya" ,22,new Address("India","Maharashtra","Mumbai"));
        return person;
    }

    @Bean(name = "Person2")
    public Person getPerson2(String getName,int getAge,Address Address2){
        return new Person(getName,getAge,Address2);
    }

    @Bean(name = "Person3")
    public Person getPerson3(@Qualifier("Address3") Address getAddress3){
        return new Person("Sandesh",23, getAddress3);
    }

    @Primary
    @Bean(name = "Address1")
    public Address getAddress(){
        var address = new Address("India","Maharashtra","Mumbai");
        return address;
    }

    @Bean(name="Address2")
    public Address getAddress2(){
        return new Address("Afghanistan","Kabul","Kandhar");
    }

    @Bean(name="Address3")
    @Qualifier("Address3")
    public Address getAddress3(){
        return new Address("Brazil","Sao Paulo","Ghazni");
    }
}
