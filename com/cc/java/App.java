package com.cc.java;


public class App {

	public static void main(String[] args) {
	
	Mitarbeiter mitarbeiter = new Mitarbeiter("Mütze", "Markus", "CEO", 2001);

		output(mitarbeiter.getName());
		output(mitarbeiter.getVorname());
		output(mitarbeiter.getFunktion());

		
			
	

	}

	

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
