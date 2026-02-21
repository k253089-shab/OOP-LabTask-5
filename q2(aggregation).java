class Laptop{
    private String brand;
    private int RAM;
    private int batteryCapacity;

    public Laptop(String brand, int RAM, int batteryCapacity){
        this.brand=brand;
        this.RAM=RAM;
        this.batteryCapacity=batteryCapacity;
    }

    public double calculateBatteryBackup(){
        return (double) batteryCapacity / (RAM * 500);
    }

    public String getBrand(){
        return brand;
    }
    public int getRAM(){
        return RAM;
    }
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
}

class Student{
    private int studentID;
    private String name;
    private Laptop laptop;

    public Student(int studentID, String name, Laptop laptop){
        this.studentID=studentID;
        this.name=name;
        this.laptop = laptop;
    }

    public void displayInfo(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Laptop Brand: " + laptop.getBrand());
        System.out.println("RAM: " + laptop.getRAM() + " GB");
        System.out.println("Battery Capacity: " + laptop.getBatteryCapacity() + " mAh");
        System.out.println("Estimated Backup: " + laptop.calculateBatteryBackup() + " hours");
    }
}

public class Main{
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Lenovo", 8, 5000);
        Laptop l2 = new Laptop("Apple", 16, 8000);

        Student s1 = new Student(1, "John", l1);
        Student s2 = new Student(2, "Wick", l2);

        s1.displayInfo();
        s2.displayInfo();
    }
}
