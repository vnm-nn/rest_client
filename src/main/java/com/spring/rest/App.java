package com.spring.rest;

import com.spring.rest.configuration.Config;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        System.out.println("****************************************************");

        Employee empById = communication.getEmployee(10);
        System.out.println(empById);

        System.out.println("****************************************************");

        Employee emp = new Employee(20,"Oleg", "Olegov", "Something", 400);
        communication.saveEmployee(emp);
        System.out.println(emp);
    }
}
