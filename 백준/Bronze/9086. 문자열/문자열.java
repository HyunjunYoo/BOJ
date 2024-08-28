import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T = sc.nextInt();
	
		for(int i=0; i<T; i++) {
			String st = sc.next();
			System.out.println(st.charAt(0) + "" + st.charAt(st.length()-1));
		}	
		sc.close();
	
	}
}