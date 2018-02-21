package com.sapient.FiringLIst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class EmployeeGraph {
int V ;
LinkedList<Employee> adjListArray[];
static int saving = 0 ;
// constructor 
EmployeeGraph(int V)
{
    this.V = V;
     
    // define the size of array as 
    // number of vertices
    adjListArray = new LinkedList[V];
     
    // Create a new list for each vertex
    // such that adjacent nodes can be stored
    for(int i = 0; i < V ; i++){
        adjListArray[i] = new LinkedList<Employee>();
    }
}
public void addEdge(EmployeeGraph graph,Employee src , Employee dest)
{
	int id = src.getId();
	int index = id % (this.V );
	graph.adjListArray[index].add(dest);
	

}
static void printGraph(EmployeeGraph graph)
{       
    for(int v = 0; v < graph.V; v++)
    {
        System.out.println("Adjacency list of vertex "+ v);
        System.out.print("head");
       
       
        for(Employee pCrawl: graph.adjListArray[v]){
            System.out.print(" -> "+pCrawl);
        }
        System.out.println("\n");
    }
}
static void costSaving(int k , Employee e,EmployeeGraph g)
{
	int index = e.getId() % (g.V);
	int count = 0;
 
	for(Employee e1 : g.adjListArray[index])
	{
		if(count<k)
		{
			saving +=  e1.getSalary() ;
					costSaving(k, e1, g) ;
			count++;
		}
		else
		 costSaving(k, e1, g);
	}
	
 
	
}
public void sorting(EmployeeGraph graph) {
	// TODO Auto-generated method stub
	 for(int v = 0; v < graph.V; v++)
	    {
	        
	        Collections.sort( graph.adjListArray[v]);
	       
	       
	    }
}
}
