import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N 바구니 생성
		int[] N = new int[10];
		
		for(int i=0; i<N.length; i++) {
			N[i] = sc.nextInt();
		}
		
		int[] M = new int[10];
		
		// N 바구니에 1부터 N까지 숫자 넣기 
		for(int i=0; i<N.length; i++) {
			M[i] = N[i] % 42;
		}
		
		int[] result = Arrays.stream(M).distinct().toArray();
		System.out.println(result.length);
		
		sc.close();
		
	}
}