package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Integer payday;
	
	private List<Employee> items = new ArrayList<>();	
	private Address address =  new Address();
	
	//Constructor
	public Department(String name, Integer payday) {
		this.name = name;
		this.payday = payday;
		
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayday() {
		return payday;
	}

	public void setPayday(Integer payday) {
		this.payday = payday;
	}

	public Address getAddress() {
		return address;
	}
	
	//Methods
	public void addItem(Employee item) {
		items.add(item);
	}
	
	public void removeItem(Employee item) {
		items.remove(item);
	}
	
	public double payroll() {
		double totalSalary = 0.0;
		for (Employee x:items) {
				totalSalary += x.getSalary(); 
		}
		return totalSalary;
	}
	
	public List<Employee> getEmployeeList() {
	        return items;
	}

}
