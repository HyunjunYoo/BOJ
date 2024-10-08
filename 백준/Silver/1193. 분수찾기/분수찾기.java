import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();

		// 해당 범위의 대각선 칸 개수
		int cross_count = 1;
		// 해당 대각선 직전 대각선 까지의 칸 누적 	합
		int prev_count_sum = 0;
		
		while (true) {
			
			// 직선 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if(X <= prev_count_sum + cross_count) {
				
				if(cross_count % 2 == 1) { // 대각선의 개수가 홀수라면
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 -1)
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.println((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
					
				}
				
				else {	// 대각선상의 블럭의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
		
	}
}