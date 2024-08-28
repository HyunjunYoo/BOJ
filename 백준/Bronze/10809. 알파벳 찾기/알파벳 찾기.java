import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		sc.close();
			
		for(int i=0; i<26; i++) {
			char ch = (char) ('a' + i);
			boolean found = false;
			
			for(int j=0; j<st.length(); j++) {	
				if(st.charAt(j) == ch) {
					System.out.print(j + " ");
					
					
					found = true;
					break;
				}
			}
			
			if(!found) {
				System.out.print("-1 ");
			}
		}
		
		
	}
}