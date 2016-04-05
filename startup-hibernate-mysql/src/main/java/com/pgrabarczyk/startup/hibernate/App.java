package com.pgrabarczyk.startup.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println( "sessionFactory = " + sessionFactory.toString() );
    }
}
