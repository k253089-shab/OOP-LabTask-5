public class Employee{
    private int employeeID;
    private String name;
    private double basicSalary;

    private static double bonusPool=0;
    private static double bonusPercentage=10;
    private static int totalEmployees=0;

    public Employee(int employeeID, String name, double basicSalary){
        this.employeeID=employeeID;
        this.name=name;
        this.basicSalary=basicSalary;
        totalEmployees++;
        bonusPool = bonusPool + (basicSalary * bonusPercentage / 100);
    }

    public double calculateTotalCompensation(){
        return (double) basicSalary + (bonusPool / totalEmployees);
    }

    public static void displayBonusPool(){
        System.out.println("Total Bonus Pool: " + bonusPool);
    }

    public void displayEmployee(){
        System.out.println("ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

public class Main{
    public static void main(String[] args){
        Employee e1 = new Employee(1, "John", 500);
        Employee e2 = new Employee(2, "Wick", 1000);
        Employee e3 = new Employee(3, "Cliff", 1500);
        Employee e4 = new Employee(4, "Booth", 2000);

        e1.displayEmployee();
        System.out.println("Total Compensation: " + e1.calculateTotalCompensation());
        e2.displayEmployee();
        System.out.println("Total Compensation: " + e2.calculateTotalCompensation());
        e3.displayEmployee();
        System.out.println("Total Compensation: " + e3.calculateTotalCompensation());
        e4.displayEmployee();
        System.out.println("Total Compensation: " + e4.calculateTotalCompensation());

        Employee.displayBonusPool();
    }
}
