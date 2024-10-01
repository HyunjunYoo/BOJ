import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 0;
			
			if(a > b) {
				result = a % b;
				if(result == 0) {
					System.out.println("multiple");
				}else {
					System.out.println("neither");
				}
					
			}else if(a < b) {
				result = b % a;
				if(result == 0) {
					System.out.println("factor");
				}else {
					System.out.println("neither");
				}
			}else if(a == 0 && b == 0) {
				break;
			}
		}
		
	}
}