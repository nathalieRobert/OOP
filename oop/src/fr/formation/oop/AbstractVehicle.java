package fr.formation.oop;

public abstract class AbstractVehicle implements Vehicle {

    private String color;

    protected AbstractVehicle(String color) {
	this.color = color;
    }

    @Override
    public String color() {
	return color;
    }
    
    public abstract int wheels();

    @Override
    public String toString() {
	return "[color=" + color + ", wheels()=" + wheels() + ", capacity=" + capacity()
		+ "]";
    }
    
    
}
