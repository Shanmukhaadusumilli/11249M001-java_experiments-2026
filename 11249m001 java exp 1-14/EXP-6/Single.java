import java.util.*;

class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra, da, grossSalary;

    PermanentEmployee(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        grossSalary = basicSalary + hra + da;
    }

    void displayDetails() {
        display();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Single {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee(101, "Ravi", 30000);
        emp.displayDetails();
    }
}