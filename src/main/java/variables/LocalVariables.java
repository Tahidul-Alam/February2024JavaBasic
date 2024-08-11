package variables;

public class LocalVariables {

	public static void main(String[] args) {		
		LocalVariables lv = new LocalVariables();
		lv.Moon();
		
	}

	
	public void Moon() {
		/*
		 * Local variable golden rules:
		 * 	double(double because decimal) bankAccount=5000.00
		 * 	double= data type
		 * 	bankAccount= is the variable name
		 * 	= is the operator
		 * 	5000.00 is the value of the variable
		 * Below car is variable and Accord is variable value
		 * 
		 * Declaration
		 * 	must declare data type
		 * 	must have name of the variable to recognize by the jvm
		 * 	"=" is the operator sign and is a must
		 *	 must declare the value or initialize the value
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
		double bankAccount=5000.00;
		final String car="Accord";
		System.out.print(bankAccount);
		
		
	}
	
	public void Alam() {
		//System.out.print(bankAccount);
	}
	
	
}
