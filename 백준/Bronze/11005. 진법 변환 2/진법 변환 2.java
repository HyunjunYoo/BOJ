import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// B진법으로 변경할 숫자
		int N = sc.nextInt();
		// B진법
		int B = sc.nextInt();
		
		System.out.println(Integer.toString(N, B).toUpperCase());
	}
}