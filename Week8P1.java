import java.util.Scanner;

public class Week8P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a sentence: ");
			String sentence = in.nextLine();

			sentence = sentence.replace(" ","");
			System.out.println(sentence);
		
		in.close();
	}
}
