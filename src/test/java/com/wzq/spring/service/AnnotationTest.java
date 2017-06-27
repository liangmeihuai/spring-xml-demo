package com.wzq.spring.service;

        import com.wzq.spring.model.Person;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tend on 2017/6/21.
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=context.getBean("person",Person.class);
        System.out.println(person.toString());
    }
}
