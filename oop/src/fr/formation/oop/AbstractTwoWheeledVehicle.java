package fr.formation.oop;

public abstract class AbstractTwoWheeledVehicle extends AbstractVehicle{

    protected AbstractTwoWheeledVehicle(String color) {
	super(color);
    }

    public int wheels() {
	return 2;
    }

   
}
