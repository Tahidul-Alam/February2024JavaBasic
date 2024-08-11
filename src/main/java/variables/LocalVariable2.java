package variables;

public class LocalVariable2 {

	public static void main(String[] args) {

		LocalVariable2 lv = new LocalVariable2();
		lv.gradeFour();
		lv.castingVote();
		lv.humanGrowUp();
	}

	public void gradeFour() {
		int grade = 4;
		if(grade==4) {
			System.out.println("You are able to get park pass.");
				
			}
		}
	
	public void castingVote() {
		int age = 18;
		//conditional statement
		//flow of statement
		//if, else, and else if
		if(age>=18) {
			System.out.println("You are able to vote.");
		}else
		{
			System.out.println("You are not old enough to vote.");
		}
	}
	public void humanGrowUp() {
		//age <=6 == Toddler
		//age >=7 == Infant
		//age >=12 == Teenager
		//age >=19 == Adult
		int age=18;
		
		if (age <=6) {
			System.out.println("You are a Toddler.");
			
		}else if (age >=7 & age <12) {
			System.out.println("You are a Infant.");
			
		}else if (age >=12 & age <19){
			System.out.println("You are a Teenager.");
		}else if (age >=19) {
			System.out.println("You are an Adult.");
		}
	
	}
	
}
