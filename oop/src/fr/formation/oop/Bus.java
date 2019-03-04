package fr.formation.oop;

public class Bus extends AbstractVehicle {

    protected Bus(String color) {
	super(color);
    }

    @Override
    public int capacity() {
	return 63;
    }

    @Override
    public int wheels() {
	return 8;
    }

    
}
