import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
//		Random random = new Random();
//		int T = random.nextInt(5)+1;
		int T = in.nextInt();

		
		for(int i=0; i<T; i++) {
//		int A = random.nextInt(9)+1;
//		int B = random.nextInt(9)+1;
		int A = in.nextInt();
		int B = in.nextInt();
			int result = A + B;
			System.out.println(result);
		}
	}
}