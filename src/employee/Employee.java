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

// Employee.java file
public class Employee {
    // Attributes
    String name;
    private int age;
    private double salary;
    private String location;

    // Constructor
    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    // Behavior: Method to raise the salary
    public void raiseSalary(double increaseAmount) {
        this.salary += increaseAmount;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Optional: Override toString method for easy printing of Employee details
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}