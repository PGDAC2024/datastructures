package com.DSA.assignment1;
class Employee{
	int Empid ;
	String Ename;
	double salary;
	
	public Employee(int empid, String ename, double salary) {
		super();
		Empid = empid;
		Ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Ename=" + Ename + ", salary=" + salary + "]";
	}
	
}


public class q4 {
	
	public static void searchByName(Employee arr[], String Name) {
	       for (Employee employee : arr) {
			  if(employee.Ename == Name) {
				  System.out.println(employee); 
			  }
		}
	       
	}
	
	public static void searchById(Employee arr[], int id) {
	       for (Employee employee : arr) {
			  if(employee.Empid == id) {
				  System.out.println(employee); 
			  }
		}
	       
	}
	
	public static void searchBySalary(Employee arr[], double Salary) {
	       for (Employee employee : arr) {
			  if(employee.salary == Salary) {
				  System.out.println(employee); 
			  }
		}
	       
	}

	public static void main(String[] args) {
		 
		Employee arr[]= { new Employee(1, "Deep", 3300),new Employee(2, "Ganesh", 300),new Employee(1, "Devesh", 3800),new Employee(1, "Prathamesh", 7700)};
        
		searchById(arr, 2);
		searchByName(arr, "Deep");
		searchBySalary(arr, 3800);
		
		
	}

}
