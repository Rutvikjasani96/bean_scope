package com.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscopeconfig.xml");

        System.out.println("\nStudent Bean");
        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1.hashCode());

        Student student2 = context.getBean("student1", Student.class);
        System.out.println(student2.hashCode());

        System.out.println("\nTeacher Bean");
        Teacher teacher1 = context.getBean("teacher", Teacher.class);
        System.out.println(teacher1.hashCode());

        Teacher teacher2 = context.getBean("teacher", Teacher.class);
        System.out.println(teacher2.hashCode());
    }
}
