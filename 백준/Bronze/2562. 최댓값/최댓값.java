import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt();
		}
		
//		int[] n = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max = n[0];
		int count = 0;
		
		for(int i=1; i<n.length; i++) {
			if(max < n[i]) {
				max = n[i];
			}
		}
		for(int i=0; i<n.length; i++) {
			count++;
			if(max == n[i]) {
				break;
			}
		}

		System.out.println(max);
		System.out.println(count);
		
		sc.close();

	}
}