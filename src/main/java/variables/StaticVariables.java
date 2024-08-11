package variables;

public class StaticVariables {

	/*
	 * What is variables?
	 * 	it can change value as necessary
	 * 	it reserves space in the memory as you declare
	 * 	it is memory management
	 * 	it organizes properties
	 * 	
	 * Local variable golden rules:
	 * 	double(double because decimal) bankAccount=5000.00
	 * 	String = data type
	 * 	bankAccount= is the variable name
	 * 	= is the operator
	 * 	Tahi is the value of the variable
	 * 
	 * Declaration
	 * 	must declare data type
	 *	 must have name of the variable to recognize by the jvm
	 *	 "=" is the operator sign and is not a must
	 *	if you do not declare the value then default value is the 
	 *	default value of the data type
	 *
	 *	 declare the value or initialize of the value is not must
	 *		Normally we do not initialize the value in the declaration
	 *		Normally constructor initialize the value or
	 *		Method initialize the value 
	 *
	 * Scope of the local variable 
	 * 	only inside the method
	 * 
	 * Access modifier
	 * 	only 'final' is allowed
	 * 	if you declare it final static then it become constant
	 * 
	 * What is the super class of java?
	 * 	The object is the super class of java
	 */

String firstName;
public static String lastName= "Ahmed";

public static void main(String[] args) {
	StaticVariables sv= new StaticVariables();
	sv.Moon();
	sv.Alam();
	sv.Tahi();
}


public void Moon() {
	firstName="Moon";
	System.out.println(firstName + " " + lastName);
}

public void Alam() {
	firstName="Alam";
	System.out.println(firstName);	
}

public void Tahi() {
	firstName="Tahi";
	
	lastName= "Rahman";
			
	System.out.println(firstName + " " + lastName);
}	

}
