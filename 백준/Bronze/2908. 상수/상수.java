import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		int reverseA = 0;
		int reverseB = 0;
		
		while(A != 0) {
			int digit = A % 10;
			reverseA = reverseA * 10 + digit;
			A /= 10;
		}
		while(B != 0) {
			int digit = B % 10;
			reverseB = reverseB * 10 + digit;
			B /= 10;
		}
		
		if(reverseA > reverseB) {
			System.out.println(reverseA);
		} else {
			System.out.println(reverseB);
		}
		
	}
}