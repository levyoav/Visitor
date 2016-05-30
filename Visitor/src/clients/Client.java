package clients;

import visitors.VacationVisitor;
import employees.Employee;

/*
 * Visiting the classes. Now, all we have to do to compute the total vacation
 * taken is to go through a list of the employees and visit each of them, and then
 * ask the Visitor for the total.
 */
public class Client {

	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee(4, 5, 100, "Yoav");
		employees[1] = new Employee(3, 6, 200, "Yoel");
		employees[2] = new Employee(2, 7, 300, "Yosi");
		
		VacationVisitor vac = new VacationVisitor();
		
		for (int i = 0; i < employees.length; i++) {
			employees[i].accept(vac);
		}
		
		System.out.println(vac.getTotalDays());
	}

}
