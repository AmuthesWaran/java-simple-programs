package begin_101;

public class StudentMarks {
	
	String name;
	int[] marks; 
	int total;
	int avg;
	String result; 
	int size;
	// Pass the student if each of the mark should be greater than or equal to 50
	
	
	public void getStudentName() {
		System.out.println("Please Enter a Student Name: ");
		 name = ReadFromUser.s.next();
	}
	
	public void getAllMarks() {
		System.out.println("Please enter no of marks to be added: ");
		size = ReadFromUser.s.nextInt();
		marks = new int[size];
		
		System.out.println("Please enter all the "+ size + "marks");
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Please enter "+ (i+1) +" mark: ");
			marks[i] = ReadFromUser.s.nextInt();
			
		}
		
	}
	
	public void displayAll() {
		System.out.println("Hi " + name + " your Exam Result is");

		for (int i = 0; i < size; i++) {
			System.out.println(marks[i]);			
		}
		
		
	}
	
	

}
