package fr.formation.oop;


public class BlackMotorbike extends Motorbike {

    protected BlackMotorbike(String color) {
	super(color);
    }
    
    @Override
    public String color() {
        return "black";
    }

}
