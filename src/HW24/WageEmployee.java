package HW24;

public class WageEmployee extends Employee{
    private double hours;
    private double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + hours *wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "hours=" + hours +
                ", wage=" + wage +
                '}';
    }
}
