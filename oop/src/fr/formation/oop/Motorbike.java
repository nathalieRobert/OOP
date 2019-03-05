package fr.formation.oop;


public class Motorbike extends AbstractTwoWheeledVehicle{
  

    protected Motorbike(String color) {
	super(color);
    }

    @Override
    public int capacity() {
	return 2;
    }

    

    


  
}
