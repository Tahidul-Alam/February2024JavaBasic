package dataType;

public class NumericData {

	public static void main(String[] args) {

/*
 * Go to shopping with 20 dollars
 * Buy apple for
 * Buy cookies
 * Bring change back
 */	
		
		int totalMoney = 20;
		int apple=5;
		//int is the data type, apple is the variable name, 5=is the value of the varibale
		int cookies=10;
		int totalSpent = apple + cookies;
		System.out.println("Total Spent = " + "" + totalSpent);
		
		int changeLeft=totalMoney-totalSpent;
		System.out.println("Change Left = " + "" + changeLeft);		
		
	}

}
