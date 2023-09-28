package com.hibernate.hibernate_28_09_labprog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *Unidirectional way
 *create a hibernate project showing one to one relation ship between product and customer(uni-directional)
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Project Started");      
         Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         
         //creating the session factory
         SessionFactory factory=cfg.buildSessionFactory();
        // System.out.println(factory.isClosed());
         
         //creating Customer object
         Customer c1=new Customer();
         c1.setCid(101);
         c1.setCname("Vivek");
         c1.setCmobile(987654321);
         
         //creating Product object
         Product p1=new Product();
         p1.setPid(201);
         p1.setPname("Sugar");
         p1.setP_price(45);
         
         
       //passing the object of project in student  
         c1.setProd(p1);
         

         
         //opening the session
         Session session=factory.openSession();
         
         //starting the transaction
         Transaction tx=session.beginTransaction();
         session.save(c1); //saving the student object
         session.save(p1); //saving the project object
         tx.commit();
         
         session.close();//close session
         factory.close();//close factory
         
    }
}
