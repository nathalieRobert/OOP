package fr.formation.oop;

import fe.simplon.oop.tp.AbstractUpperTwoWheels;

public class Bus extends AbstractUpperTwoWheels {

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
