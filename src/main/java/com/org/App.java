package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started.." );
        AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
        HibernateTemplate Data=container.getBean("hiber", HibernateTemplate.class);
        Data.HibernateE();
        System.out.println("program End....");
    }

}
