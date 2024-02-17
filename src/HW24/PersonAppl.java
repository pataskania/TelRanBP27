package HW24;

public class PersonAppl {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Andrey",33,true,"IBM","manager",13000,3);
        Manager manager2 = new Manager("Sergey",44,false,"IBM","manager",15000,1);
        WageEmployee wageEmployee1 = new WageEmployee("Anatoly",22,true,"IBM","technic",10000,2.0,3.0);
        WageEmployee wageEmployee2 = new WageEmployee("Vadim",33,false,"IBM","technic",12000,1.0,3.0);
        WageEmployee wageEmployee3 = new WageEmployee("San Sanich",66,false,"IBM","storage worker",9000,1.0,2.0);
        WageEmployee wageEmployee4 = new WageEmployee("Ivan Ivanich",65,true,"IBM","storage worker",7000,1.0,2.0);
        SaleManager saleManager1 = new SaleManager("Ivan",22,false,"IBM","sale manager",2.0,2.0,3.0);
        SaleManager saleManager2 = new SaleManager("Sergey",22,false,"IBM","sale manager",2.0,3.0,3.0);
        SaleManager saleManager3 = new SaleManager("Ivan",44,false,"IBM","sale manager",3.0,2.0,3.0);
        SaleManager saleManager4 = new SaleManager("Alexander",33,false,"IBM","sale manager",2.0,2.0,3.0);

        Employee[] employees = {manager1, manager2,
                wageEmployee1, wageEmployee2, wageEmployee3, wageEmployee4,
                saleManager1, saleManager2, saleManager3, saleManager4};


    }

    public static void printAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }

    }
    public static void printSalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].calculateSalary());
        }
    }
    public static void printSales(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof SaleManager) {
                SaleManager saleManager = (SaleManager) employees[i];
                System.out.println(saleManager.getTotalSales());
            }
        }
    }
    public static boolean findEmployees(Employee[]employees,Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].equals(employee)){
                return true;
            }
        }
        return false;
    }
}
