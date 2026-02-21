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
    private Laptop l1;

    public Student(int studentID, String name, String brand, int RAM, int batteryCapacity){
        this.studentID=studentID;
        this.name=name;
        this.l1 = new Laptop(brand, RAM, batteryCapacity);  
    }

    public void displayInfo(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Laptop Brand: " + l1.getBrand());
        System.out.println("RAM: " + l1.getRAM() + " GB");
        System.out.println("Battery Capacity: " + l1.getBatteryCapacity() + " mAh");
        System.out.println("Estimated Backup: " + l1.calculateBatteryBackup() + " hours");
    }
}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", "Lenovo", 1024, 100);
        Student s2 = new Student(2, "Wick", "Acer", 2048, 99);

        s1.displayInfo();
        s2.displayInfo();
    }
}
