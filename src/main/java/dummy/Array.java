package dummy;

public class Array {

	public static void main(String[] args) {
		Array array = new Array();
		array.countStudents();
		
		
	}
	
	public void countStudents() {
		//String studentsOne="Tahi";
		//String studentsTwo="Alam";
		//String studentsThree="Moon";
		
		String [] students= {"Tahi","Alam","Moon","Tahidul","Aoyon","Tahura"};
		System.out.println();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			
		}
			System.out.println();
			for (int i = 0; i < students.length; i++) {
				if (students[i].equalsIgnoreCase("Tahidul")) {
					break;
	}
			System.out.println(students[i]);
			

	}
	}
}


