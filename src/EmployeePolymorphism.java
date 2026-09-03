class Employee {

    void calculateSalary() {
        System.out.println("Employee salary calculation");
    }
}

class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager salary: 80000");
    }
}

class Developer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Developer salary: 60000");
    }
}

class Intern extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Intern salary: 20000");
    }
}

public class EmployeePolymorphism {

    public static void main(String[] args) {

        Employee employee;

        employee = new Manager();
        employee.calculateSalary();

        employee = new Developer();
        employee.calculateSalary();

        employee = new Intern();
        employee.calculateSalary();
    }
}