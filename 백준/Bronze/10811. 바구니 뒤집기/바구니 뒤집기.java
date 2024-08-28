import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열 길이 및 반복횟수
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
	
		// 배열 값 생성
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
	
		for(int i=0; i<M; i++) {			
			int left = sc.nextInt()-1;
			int right = sc.nextInt()-1;
			
			
			while(left < right) {
				int temp = arr[left];
				arr[left++] = arr[right];
				arr[right--] = temp;
			}	
		}
		sc.close();

		// 출력
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}