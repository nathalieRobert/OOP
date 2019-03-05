package fr.formation.oop;

import fe.simplon.oop.tp.AbstractUpperTwoWheels;

public class Car extends AbstractUpperTwoWheels {

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
