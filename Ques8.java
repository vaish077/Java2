import java.util.Scanner;

public class Ques8{

	public static void main(String[] args) {
		String terminate = "done"; 
	    boolean running = true; 
	    Scanner sc = new Scanner(System.in);

	    do {
	        System.out.print("Enter a word: "); 
	        String word = sc.nextLine();
	        if (word.toLowerCase().equals(terminate)) {
	            running = false;
	            System.out.println("Out of the loop and terminate");

	        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
	            System.out.println("The first character is equal to it's last character: " + word);
	        } else {
	            System.out.println("The first character is not equal to it's last character: " + word);
	        }
	    } while (running);
	}
}