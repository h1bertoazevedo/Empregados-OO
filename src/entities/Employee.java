package entities;

public class Employee {
	
	private String name;
	private double salary;
	
	//Constructor
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
