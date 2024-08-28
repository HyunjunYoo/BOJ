import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int result = A + B;
			
			if(result == 0) {
				break;
			} else {
				System.out.println(result);				
			}
		}		
	}
}