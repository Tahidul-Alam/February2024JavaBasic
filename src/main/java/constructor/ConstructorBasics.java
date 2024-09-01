package constructor;

public class ConstructorBasics {

	/*
	 * Constructor has the same name as the class name
	 * Constructor neither void or return type
	 * Constructor instantiate instance properties
	 * there are two types of constructor
	 * 		user default constructor(you can have as many user define constructor as you need)
	 * 		default constructor
	 * 		if user did not create a constructor then java will provide a default constructor, you do not see it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorBasics cb = new ConstructorBasics();
		cb.fullNameTest("Tahidul", "Alam");
		
	}
	
	public String fullNameTest(String firstName ,String lastName) {
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
		return fullName;
		
			
		
	}

}
