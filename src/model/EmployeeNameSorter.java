package model;

import java.util.Comparator;

public class EmployeeNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if(!o1.getName().equals(o2.getName())){
			return o1.getName().compareTo(o2.getName());
		}else {
			return (int) (o1.getSalary()-o2.getSalary());
		}

	}
}
