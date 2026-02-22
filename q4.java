class House{
    private int houseID;
    private String name;
    private Room room;

    public House(int houseID, String name, int deviceID, double powerRating, double hoursUsedPerDay){
        this.houseID=houseID;
        this.name=name;
        this.room = new Room(deviceID, powerRating, hoursUsedPerDay);
    }

    public double dailyElectricityConsumption(){
        return room.energyUsage();
    }
}

class Room{
    private Device device;

    public Room(int deviceID, double powerRating, double hoursUsedPerDay){
        this.device = new Device(deviceID, powerRating, hoursUsedPerDay);
    }

    public double energyUsage(){
        return device.calculateDailyEnergy();
    }
}

class Device{
    private int deviceID;
    private double powerRating;
    private double hoursUsedPerDay;

    public Device(int deviceID, double powerRating, double hoursUsedPerDay){
        this.deviceID=deviceID;
        this.powerRating=powerRating;
        this.hoursUsedPerDay=hoursUsedPerDay;
    }

    public double calculateDailyEnergy(){
        return powerRating * hoursUsedPerDay;
    }
}

public class Main{
    public static void main(String[] args){
        House h1 = new House(305, "Tahir Villa", 786, 24, 8);

        System.out.println("Total Daily Electricity Consumption: " + h1.dailyElectricityConsumption());
    }
}
