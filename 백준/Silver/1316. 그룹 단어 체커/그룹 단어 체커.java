import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int count = 0;
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
		

		// 그룹 단어를 체크할 함수이다.
	public static boolean check() {
		// 알파벳 26개가 이전에 등장했는지 기록한다(초기값 false)
		 boolean[] check = new boolean[26];
		 
		 // 이전에 확인한 문자를 저장할 변수이다
		 int prev = 0;
		 String str = sc.next();
		 
		 for(int i=0; i<str.length(); i++) {
			 int now = str.charAt(i); // i 번째 문자 저장(현재 문자)
			 
			 // 앞선 문자와 현재 문자가 같지 않다면?
			 if(prev != now) {
				 
				 // 해당 문자가 처음 나오는 경우 (false 인 경우)
				 if (check[now - 'a'] == false) {
					 check[now -'a'] = true; // true로 바꾸어준다
					 prev = now; // 다음 턴을 위해 prev 도 바꿔준다
				 }
				 
				 // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게됨)
				 else {
					 return false; // 함수 종료
				 }
			 }
		 }
		 return true;
	}
}

