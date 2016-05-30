package visitors;

import employees.Employee;

/*
 * Note that we have included the accept method in this class. Now let's suppose that 
 * we want to prepare a report of the number of vacation days that all employees have taken so far
 * this year. We could just write some code in the client to sum the results of calls to each
 * Employee's getVacDays function, or we could put this function into a Visitor. Since Java
 * is a strongly typed language, your base Visitor class needs to have a suitable abstract
 * visit method for each kind of class in your program. In this first simple example, we only
 * have Employees, so our basic abstract Visitor class is just Employee.  
 */
public abstract class Visitor {
	public abstract void visit(Employee emp);
}
