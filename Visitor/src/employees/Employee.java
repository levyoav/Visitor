package employees;

import visitors.Visitor;

public class Employee {
	int sickDays, vacDays;
	float salary;
	String name;
	
	public Employee(int sickDays, int vacDays, float salary, String name) {
		super();
		this.sickDays = sickDays;
		this.vacDays = vacDays;
		this.salary = salary;
		this.name = name;
	}

	public int getSickDays() {
		return sickDays;
	}

	public int getVacDays() {
		return vacDays;
	}

	public float getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
