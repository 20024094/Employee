package employee;

/**
 * Student: Daniel Barbu: 20024094
 * Application: Employee
 * Description: Employee class provides description details of employee
 * Version: 1.0
 * Date: 25/01/2023
 * Module: Software Development: Programming Foundations
 *
 * @author 20024094
 */

// Main.java file
public class Main {
    public static void main(String[] args) {
        // Creating two Employee instances
        Employee employee1 = new Employee("Alice", 30, 50000, "New York");
        Employee employee2 = new Employee("Bob", 35, 55000, "Los Angeles");

        // Giving a raise to the first employee
        employee1.raiseSalary(5000); // Raising Alice's salary by $5000

        // Printing out the salaries of both employees
        System.out.println("Salary of " + employee1.name + ": $" + employee1.getSalary());
        System.out.println("Salary of " + employee2.name + ": $" + employee2.getSalary());
    }
}
