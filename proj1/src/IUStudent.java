import java.util.Scanner;

public class IUStudent extends Student{
	public IUStudent(String FullName, int course, int lastMark){
		this.FullName = FullName;
		this.course = course;
		this.lastMark = lastMark;
		if(FullName.isEmpty() || course > 6 || course < 0 || lastMark > 5 || lastMark < 0){
			throw new RuntimeException("Incorrect fields of object " + this.hashCode());
		}
	}

	@Override
	void writeExam(Scanner inpScanner) {
		System.out.println("I'm writing new coding contest.\nEnter mark: ");
		int newMark;
		do{
			newMark = inpScanner.nextInt();
			if (newMark < 0 || newMark > 5){
				System.err.println("Incorrect input, try again: ");
			}
		}while(newMark < 0 || newMark > 5);

		this.lastMark = newMark;
	}	
}
