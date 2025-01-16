

/*
Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
It is an important part of OOPs (Object Oriented programming system).
The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
When you inherit from an existing class, you can reuse methods and fields of the parent class.
Moreover, you can add new methods and fields in your current class also.

 */

class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private double empSalary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Designation: " + empDesignation);
        System.out.println("Employee Salary: " + empSalary);
    }
}

public class Pactice_02 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("John Doe");
        emp.setEmpSalary(50000);
        emp.setEmpDesignation("Software Engineer");
        emp.display();

    }
}
