import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String test = sc.nextLine();
		
		int count = 0;
		
		for(int i=0; i<test.length(); i++) {
			
			char ch = test.charAt(i);
			
			if(ch == 'c') {
				if(i < test.length()-1) {
					if(test.charAt(i + 1) == '=') { // c= 일 경우
						// i+1 까지 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
						i++;
					}
					else if(test.charAt(i + 1) == '-') { // c- 일 경우
						i++;
					}
				}
			}
			else if(ch == 'd') {
				if(i < test.length() - 1) {
					if(test.charAt(i + 1) == 'z') {
						if(i < test.length() - 2) {
							if(test.charAt(i + 2) == '=') { // dz= 일 경우
								
								i += 2;
							}
						}
					}
					else if(test.charAt(i + 1) == '-') {  // d- 일 경우
						i++;
					}
				}
			}
			
			else if(ch == 'l') {
				if(i < test.length() - 1) {
					if(test.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			
			else if(ch == 'n') {
				if(i < test.length() - 1) {
					if(test.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			
			else if(ch == 's') {
				if(i < test.length() - 1) {
					if(test.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			
			else if(ch == 'z') {
				if(i < test.length() - 1) {
					if(test.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			

		count++;
		
	}

		System.out.println(count);
		
	}
}
