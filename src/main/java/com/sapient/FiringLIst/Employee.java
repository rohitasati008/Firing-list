package com.sapient.FiringLIst;

public class Employee implements Comparable {
int id ;
String name ;
int rating ;
int salary ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(int id, String name, int rating, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.rating = rating;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", rating=" + rating + ", salary=" + salary + "]";
}
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Employee e = (Employee) o ;
 if( this.rating - e.rating != 0)
	 return this.rating - e.rating  ; 
 else
	 return this.salary- e.salary ;
}

}
