package Secao08.EmployeePOO;

public class EmployeeMetods {
    public String name;
    public double salary;
    public double tax;
    public double taxation;
    public double netSalary(){
        return salary - tax;
    }
    public double increaseSalary(){
        return (salary - tax) + (salary * taxation);
    }
    public String toString() {
        return "Employee: " + name + ", $" + salary;
    }
    public String toString2(){
        return "Update data: " + name + ", " + increaseSalary();
    }
}
