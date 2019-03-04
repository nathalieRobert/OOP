package fr.formation.oop;


public class Motorbike extends AbstractVehicle{
    
    

    protected Motorbike(String color) {
	super(color);
    }

    @Override
    public int capacity() {
	return 2;
    }

    @Override
    public int wheels() {
	return 2;
    }
    
  
}
