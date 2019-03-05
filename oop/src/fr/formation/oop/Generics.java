package fr.formation.oop;


import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
	List list = new ArrayList();
	list.add("string");
	list.add(123);
	System.out.println(list);
	
	//List generic donc avec un type (ici <String>) 
	List<String> listGeneric = new ArrayList<>();
	listGeneric.add("string");
	//ici le integer ne machera pas car pas de type <String>
	//listGeneric.add(123);
	System.out.println(listGeneric);
	
	
	//Faire une list Object (qui est la superclass de java.lang) qui peut contenir tous les types
	List<Object> listGeneric2 = new ArrayList<>();
	listGeneric2.add("string");
	listGeneric2.add(123);
	
	
	System.out.println("-----------------------------------------------------------------------------------------");
	
	
	List<Vehicle> listVehicle = new ArrayList<>();
	Car car1 = new Car("RED");
	Car car2 = new Car("BLUE");
	Bus bus1 = new Bus("BLACK");
	Bus bus2 = new Bus("BLACK");
	
	listVehicle.add(car1);
	listVehicle.add(car2);
	listVehicle.add(bus1);
	
	
	System.out.println(listVehicle);
	
	for (Vehicle car : listVehicle) {
	    System.out.println(car);
	    
	}
	
	System.out.println("------------------------------------------------------------------");
	
	List<AbstractTwoWheeledVehicle> moto = new ArrayList<>();
	Motorbike moto1 = new Motorbike("RED");
	Bus bus3 = new Bus("BLACK");
	//Bus a plus de deux roues donc ne peut etre adder dans l'objet AbstractTwoWheeledVehicule
	//moto.add(bus3);
	moto.add(moto1);
	System.out.println(moto);
	
	
	
    }
}