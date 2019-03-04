package fr.formation.oop;

public class Application {

    public static void main(String[] args) {
//	Vehicle vehicle = new Car("blue");
//	System.out.println(vehicle);
//	printColor(vehicle);
	Vehicle bus = build("bus", "blue");
	System.out.println(bus);
	printCapacity(bus);
	
    }

    private static void printColor(Vehicle vehicle) {
	System.out.println(vehicle.color());
    }

    private static void printCapacity(Vehicle vehicle) {
	System.out.println(vehicle.capacity());
    }

    private static Vehicle build(String type, String color) {
	Vehicle vehicle = null;
	switch (type) {
	case "car":
	    vehicle = new Car(color);
	    break;
	case "bus":
	    vehicle = new Bus(color);
	    break;
	case "motorbike":
	    vehicle = new Motorbike(color);
	    break;
	default:
	    throw new IllegalArgumentException("Unknown type: "+ type);
	    
	}
	return vehicle;
    }
}
