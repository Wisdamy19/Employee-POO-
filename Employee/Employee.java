package Secao08.EmployeePOO;

import java.util.Scanner;
import java.util.Locale;
import java.io.PrintStream;

public class Employee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        EmployeeMetods employeeMetods = new EmployeeMetods();
        System.out.println("Name: ");
        employeeMetods.name = scan.next();
        System.out.println("Salary: ");
        employeeMetods.salary = scan.nextDouble();
        System.out.println("Tax: ");
        employeeMetods.tax = scan.nextDouble();

        System.out.println(employeeMetods);

        System.out.println("Which percentage to increase salary? ");
        employeeMetods.taxation = scan.nextDouble();

        System.out.println(employeeMetods.toString2());
    }
}
