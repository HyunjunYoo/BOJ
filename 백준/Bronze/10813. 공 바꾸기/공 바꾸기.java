import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N 바구니 생성
		int[] N = new int[sc.nextInt()];
		
		for(int i=0; i<N.length; i++) {
			N[i] = i+1;
		}
		
		// M for문 반복횟수
		int M = sc.nextInt();
		
		for(int x=0; x<M; x++) {
			int i = sc.nextInt(); 
			int j = sc.nextInt(); 
			int value = N[i-1];
			N[i-1] = N[j-1];
			N[j-1] = value;
		}
		
		for(int x : N) {
			System.out.print(x + " ");
		}
		
		sc.close();
	}
}