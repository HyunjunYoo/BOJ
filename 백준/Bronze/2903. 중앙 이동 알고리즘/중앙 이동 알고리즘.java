import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int galo = 2;
		int selo = 2;
		for(int i=0; i<N; i++) {
			galo += (galo-1);
			selo += (selo-1);
			
		}
		System.out.println(galo * selo);
	}
}