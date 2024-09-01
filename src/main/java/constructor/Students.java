package constructor;

public class Students {
	int id;
	String firstName;
	String lastName;
	
	
	
	
	public Students(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println(id +", " + firstName + " " + lastName);
	}

	public static void main(String[] args) {
		
		Students tahidul = new Students(3, "Tahidul", "Alam");
		double tahidulseleniumFee=tahidul.courseJava(500.00);
		double tahiduljavaFee=tahidul.courseSelenium(1000.00);
		double tahidultotalFee=tahidulseleniumFee+tahiduljavaFee;
		System.out.println("Total due = "+tahidultotalFee);
		
		Students moon = new Students(4, "Moon", "Alam");
		double moonseleniumFee=moon.courseJava(900.00);
		double moonjavaFee=moon.courseSelenium(2500.00);
		double moontotalFee=moonseleniumFee+moonjavaFee;
		System.out.println("Total due = "+moontotalFee);

	}

	public double courseSelenium(double tuitionFee) {
		System.out.println("Selenium fee: " + tuitionFee);
		return tuitionFee;
	}
	
	public double courseJava(double fee) {
		System.out.println("Java fee: " + fee);
		return fee;
				
	}
}

