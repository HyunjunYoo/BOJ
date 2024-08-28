import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		String input = sc.nextLine();
		
		if(input.trim().isEmpty()) {
			System.out.println(0);
		} else {
			String[] words = input.trim().split("\\s+");
			System.out.println(words.length);			
		}
		sc.close();
	}
}