import java.util.Scanner;

public class Week8P3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a word: ");
			String word = in.nextLine();
			
		System.out.print("Enter a character to remove: ");
			String removeChar = in.nextLine();
		
			word = word.replace(removeChar,"");
			
		System.out.println(word);
		
		in.close();
	}
}
