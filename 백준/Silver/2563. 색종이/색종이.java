import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 도화지
		boolean[][]  canvas = new boolean[100][100];
		// 색종이 갯수
		int paper = sc.nextInt();
		// 검은색 부분
		int count = 0;
		
		for(int i=0; i<paper; i++ ) {
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			for(int j=x; j<(x+10); j++) {
				for(int k=y; k<(y+10); k++) {
					if(canvas[j][k] == false) {
						canvas[j][k] = true;
					}
					
				}
			}
			
		}
		
		// true count
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(canvas[i][j] == true) {
					count += 1;
				}
			}	
		}
		
		System.out.println(count);
			
	}
}