import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 약수들의 합
		Scanner sc= new Scanner(System.in);
		
		while(true) {			
			int N = sc.nextInt();
			
			if(N==-1 || N==0) break;
			
			int[] arr = new int[N];
			int sum = 0;
			int count = 0;
			
			// 완전수 계산 함수
			for(int i=1; i<=(N/2); i++) {
				if(N%i == 0) {
					arr[count] = i;
					count++;
					sum += i;
				}
			} // for end
			
			// 완전수 판단문
			if(sum == N) {
				System.out.print(N + " = ");
				for(int i=1; i<=(N/2); i++) {
					if(N % i == 0) {
						System.out.print(i);
						if(i<(N/2)) {
							System.out.print(" + ");													
						}
					}
				}
				System.out.println();

			} else if(sum != N) {
				System.out.println(N + " is NOT perfect.");
			} // if end
		} // while end
	}
}