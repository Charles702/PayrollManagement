package com.simple.hr;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);


        //
        SalariedEmployee emp1 = new SalariedEmployee("Charles", 70000);
        HourlyEmployee emp2 = new HourlyEmployee("Lily", 60);
        SalariedEmployee se1 = new SalariedEmployee("Charles", 70000);
        SalariedEmployee se2 = new SalariedEmployee("Charles", 90000);
        SalariedEmployee se3 = new SalariedEmployee("Charles", 1000000);


        String fileName = "Paystubs.txt";
        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(se1);
        employees.add(se2);
        employees.add(se3);

        SalariedEmployee.printStub(fileName, employees);

    }
}
