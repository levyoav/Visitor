package visitors;

import employees.Employee;

/*
 * Notice that there is no indication what the Visitor does with each class in either the client classes
 * or the abstract Visitor class. We can in fact write a whole lot of visitors that do different things
 * to the classes in our program. The Visitor we are going to write first just sums the vacation data for
 * all our employees.  
 */
public class VacationVisitor extends Visitor {
	
	protected int totalDays;
	
	public VacationVisitor() {
		super();
		this.totalDays = 0;
	}

	@Override
	public void visit(Employee emp) {
		totalDays +=emp.getVacDays();
	}

	public int getTotalDays() {
		return totalDays;
	}

}
