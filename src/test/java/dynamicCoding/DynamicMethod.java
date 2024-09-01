package dynamicCoding;

public class DynamicMethod {

	public static void main(String[] args) {

		DynamicMethod dm = new DynamicMethod();
		//static coding
		dm.fullName();
		dm.fullName();

		//dynamic coding with void method
		/*
		 * in the void method
		 * whatever logics/arguments you made is final
		 * 
		 */
		dm.dynamicFullName("Jazz","Alam");
		dm.dynamicFullName("Moon","Alam");
		dm.dynamicFullName("Tahi","Alam");

		//dynamic coding with return method
		/*
		 * in return type method
		 * whatever logics/argument 
		 */
		String upperCaseName = dm.returnTypefullName("faruk","molla").toUpperCase();
		System.out.println(upperCaseName);
		String lowerCase = dm.returnTypefullName("Tah","Ahmed").toLowerCase();
		System.out.println(lowerCase);
		
	}

	
	
	public void fullName() {
		String firstName="Tahidul";
		String lastName="Alam";
		String fullName=firstName +" "+ lastName;
		System.out.println(fullName);
		

	}
	
	
	public void dynamicFullName(String firstName, String lastName) {
		String fullName=firstName +" "+ lastName;
		System.out.println(fullName);

	}
	public String returnTypefullName(String firstName, String lastName) {
		String fullName=firstName +" "+ lastName;
		System.out.println(fullName);
		return fullName;

	}
}
