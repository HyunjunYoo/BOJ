import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int Q = 25;
		int D = 10;
		int N = 5;
		int P = 1;
		
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			
			System.out.print(a/Q + " ");
			System.out.print((a % Q) / D + " ");
			System.out.print(((a % Q) % D) / N + " ");
			System.out.println((((a % Q) % D) % N) / P);
		}
	}
}