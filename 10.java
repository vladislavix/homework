abstract class Person {
    String name;
    int birthYear;
    double salary;

    public Person(String name, int birthYear, double salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Salary: " + salary);
    }
}

class Director extends Person {
    public Director(String name, int birthYear, double salary) {
        super(name, birthYear, salary);
    }

    public void manage() {
        System.out.println("Managing the company");
    }
}

class DepartmentHead extends Person {
    public DepartmentHead(String name, int birthYear, double salary) {
        super(name, birthYear, salary);
    }

    public void supervise() {
        System.out.println("Supervising the department");
    }
}

class Employee extends Person {
    public Employee(String name, int birthYear, double salary) {
        super(name, birthYear, salary);
    }

    public void work() {
        System.out.println("Working hard");
    }
}

public class Main {
    public static void main(String[] args) {
        Director director = new Director("John Smith", 1970, 100000);
        DepartmentHead departmentHead = new DepartmentHead("Jane Doe", 1980, 50000);
        Employee employee = new Employee("Bob Johnson", 1990, 25000);

        director.printInfo();
        director.manage();

        departmentHead.printInfo();
        departmentHead.supervise();

        employee.printInfo();
        employee.work();
    }
}
