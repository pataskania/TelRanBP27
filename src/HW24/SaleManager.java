package HW24;

public class SaleManager extends Employee {
    private double totalSales;
    private double bonus;

    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }

    @Override
    public void display(){
        System.out.println(toString());
    }

   @Override
    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return "SaleManager{" +
                "totalSales=" + totalSales +
                ", bonus=" + bonus +
                '}';
    }
}
