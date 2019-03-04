package fr.formation.oop;

public class Car extends AbstractVehicle {

    protected Car(String color) {
	super(color);
    }

    @Override
    public int capacity() {
	return 5;
    }

    @Override
    public int wheels() {
	return 4;
    }

    
}
