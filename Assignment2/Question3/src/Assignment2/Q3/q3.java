package Assignment2.Q3;

import java.util.Arrays;

class Employee{
	 int empId;
	 String Name;
	 double sal;
	public Employee(int empId, String name, double sal) {
		this.empId = empId;
		Name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", sal=" + sal + "]";
	}	
}

public class q3 {
	
	static void SortBySalary(Employee arr[]) {
		for (int i = 1; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j].sal > arr[j+1].sal) {
			         Employee temp =	arr[j];	
			         arr[j]=arr[j+1];
			         arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
	       
		Employee arr[] = {new Employee(1, "Deep",200),new Employee(2, "Shewale", 100),new Employee(3, "mayur", 1000),new Employee(4, "Ganesh",250)};
        SortBySalary(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
