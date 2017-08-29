package javabyexample.objects.employee;

import java.util.Comparator;

public class Employee {

	private String employeeID;
	private String firstName;
	private String lastName;
	private String managerID;
	private double baseSalary;
	private String department;
	private double bonus;

	public static final String DEPT_FINANCE = "Finance";
	public static final String DEPT_SALES = "Sales";
	public static final String DEPT_PRODUCTION = "Production";
	public static final String DEPT_LEADERSHIP = "Leadership";

	public Employee(String employeeID) {
		this(employeeID, "", "", "", 0);
	}

	public Employee(String employeeID, String firstName, String lastName, String managerID, double baseSalary) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.managerID = managerID;
		this.baseSalary = baseSalary;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getManagerID() {
		return managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() {
		return this.baseSalary + this.bonus;
	}

	public static class Comparators {
		public static final Comparator<Employee> DEPARTMENT = (Employee e1, Employee e2) -> e1.department
				.compareTo(e2.department);
		public static final Comparator<Employee> LASTNAME = (Employee e1, Employee e2) -> e1.lastName
				.compareTo(e2.lastName);
		public static final Comparator<Employee> BASESALARY = (Employee e1, Employee e2) -> Double
				.compare(e1.baseSalary, e2.baseSalary);
		public static final Comparator<Employee> DEPTBASESALARY = (Employee e1, Employee e2) -> DEPARTMENT
				.thenComparing(BASESALARY).compare(e1, e2);
		public static final Comparator<Employee> SALARY = (Employee e1, Employee e2) -> Double.compare(e1.getSalary(),
				e2.getSalary());
	}

}
