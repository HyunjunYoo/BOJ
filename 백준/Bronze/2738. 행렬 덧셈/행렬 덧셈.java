import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 행렬을 A, B를 받을 배열 변수 생성
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		// 첫 번째 행렬 A를 받기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		// 두 번째 행렬 B를 받기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// 두 개의 행렬을 각각 더하여 출력하기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr1[i][j] + arr2[i][j]+" ");
				
				// 각 행이 끝날 때 마다 줄 넘기기
				if(j == m-1) {
					System.out.println();
				}
			}
		} // for end
		
	}
}