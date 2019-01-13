package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sean", "sean.m@gmail.com", 90000.00));
		empList.add(new Employee("Sean", "sean.m@gmail.com", 20000.00));
		empList.add(new Employee("Sean", "sean.m@gmail.com", 50000.00));
		empList.add(new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
		empList.add(new Employee("Martin", "martin.m300@gmail.com", 80000.00));

/**
 * normal sort avec classe
  */

//		System.out.println("List of employee before sorting..");
//		empList.forEach(System.out::println);
//
//		Collections.sort(empList, new EmployeeNameSorter());
//
//		System.out.println("la liste triee");
//		empList.forEach(s-> System.out.println(s));

/**
 * java 8 lambda sort
  */

		Collections.sort(empList, Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getSalary));

		empList.forEach(System.out::println);

//		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
//
//		System.out.println("--------------------------------------------");
//		System.out.println("List of employee after sorting..");
//		empList.forEach(System.out::println);
		
	
	}
}
