import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[] N = new int[sc.nextInt()];
		int M = sc.nextInt();
		
		for(int x=0; x<M; x++) {
			int i = sc.nextInt(); 
			int j = sc.nextInt(); 
			int k = sc.nextInt();
			
			for(int y=i-1; y<j; y++) {
				N[y] = k;
			}
		}
		
		for(int x=0; x<N.length; x++) {
			System.out.print(N[x] + " ");
		}
	
		
		sc.close();

	}
}