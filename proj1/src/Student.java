import java.util.Scanner;

public abstract class Student{
	protected String FullName;
	protected int course;
	protected int lastMark;

	abstract void writeExam(Scanner inpScanner);

	@Override
	public String toString() {
		String suffix = "th";
		if (course%10 == 1 && course%100 != 11) suffix = "st";
		else if(course%10 == 2 && course%100 != 12) suffix = "nd";
		else if(course%10 == 3) suffix = "rd";
		return "I am " + FullName +". I am on " + course + suffix + " course and my last mark was " + lastMark + ".";
	}
}