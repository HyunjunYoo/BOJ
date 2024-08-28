
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 점수, 최고값, 총합 변수 생성
		double[] arr = new double[sc.nextInt()];
		
		// 성적 값 받기
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		double total = 0;
		double max = 0;
		
		// 최고값 찾기
		for(int i=0; i< arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		// 점수 다시 계산하기
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i] / (double) max * 100;
			total += arr[i];
		}
		
		
		// 출력
		System.out.print(total / arr.length);
	}
}