import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Student me = new IUStudent("NLV", 1, 5);
		System.out.println(me);
		me.writeExam(input);
		System.out.println(me);

		Student math = new MathStudent("someone", 2, 4);
		System.out.println(math);
		math.writeExam(input);
		System.out.println(math);
	}
}
