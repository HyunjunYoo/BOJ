import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		int N = in.nextInt();
		
//		Random random = new Random();
//		
//		int N = random.nextInt(100)+1;
		
//		System.out.println(N);
		
		for(int i=0; i<(N/4); i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}