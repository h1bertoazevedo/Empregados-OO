package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String deptName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payday = sc.nextInt();
		
		Department department = new Department(deptName, payday);
		
		sc.nextLine();
		System.out.print("Email: ");
		department.getAddress().setEmail(sc.nextLine());
		System.out.print("Telefone: ");
		department.getAddress().setPhone(sc.nextLine());
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionário "+(i+1)+":");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employees = new Employee(name, salary);
			department.addItem(employees);
		}
		System.out.println();
		showReport(department);
		
		System.out.println("Para dúvidas favor entrar em contato: "+department.getAddress().getEmail());
		sc.close();
	}

	private static void showReport(Department dept) {
	    StringBuilder report = new StringBuilder();

	    report.append("FOLHA DE PAGAMENTO: \n");
	    report.append("Departamento Vendas = R$ ");
	    report.append(String.format("%.2f", dept.payroll())).append("\n");
	    report.append("Pagamento realizado no dia ");
	    report.append(dept.getPayday()).append("\n");
	    report.append("Funcionários:\n");

	    List<Employee> employeeNames = dept.getEmployeeList();

	    for (Employee employee : employeeNames) {
	        report.append(employee.getName()).append("\n");
	    }

	    System.out.print(report.toString());
	}
}


