package HW24;

import java.util.Objects;

public abstract class Employee extends Person {
    private String company;
    private String position;
    private double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void display(){
        System.out.println(toString());

    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.baseSalary, baseSalary) == 0 && Objects.equals(company, employee.company) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, position, baseSalary);
    }
}
