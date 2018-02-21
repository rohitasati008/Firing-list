package com.sapient.FiringLIst;

import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
 Logger logger = Logger.getLogger("test.logger");
    public void testApp()
    {
     Employee e1 = new Employee(1,"ROhit",3,2000);
     Employee e2 = new Employee(2,"mOhit",5,5000);
     Employee e3 = new Employee(3,"sOhit",4,7000);
     Employee e4 = new Employee(4,"fOhit",2,12000);
     Employee e5 = new Employee(5,"lOhit",3,26000);
     Employee e6 = new Employee(6,"zOhit",1,3000);
     Employee e7 = new Employee(7,"RdOhit",4,24000);
      EmployeeGraph graph = new EmployeeGraph(8);
      graph.addEdge(graph, e1, e2);
      graph.addEdge(graph, e1, e3);
      graph.addEdge(graph, e1, e4);
      graph.addEdge(graph, e2, e5);
      graph.addEdge(graph, e2, e6);
      graph.addEdge(graph, e4, e7);
      graph.sorting(graph);
      graph.printGraph(graph);
     graph.costSaving(2, e1, graph);
    System.out.println(graph.saving);
      
      
        
    }
}
