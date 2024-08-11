package variables;

public class InstanceVariables {
	/*
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
	 *	 "=" is the operator sign and is a must
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
	 * 
	 * What is the super class of java?
	 * 	The object is the super class of java
	 */
	
	final int roll=1;
	double saving;
	String firstName;
	String firstName1="Tahi";
	
	public static void main(String[] args) {
		
		InstanceVariables iv = new InstanceVariables();
		System.out.println(iv.roll);
		System.out.println(iv.saving);
		System.out.println(iv.firstName);
		System.out.println(iv.firstName1);
		iv.Moon();
		iv.Alam();
	}
	
	public void Moon() {
		firstName="Moon";
		System.out.println(firstName);
	}

public void Alam()	{
	firstName="Alam";
	System.out.println(firstName);

	}

}
