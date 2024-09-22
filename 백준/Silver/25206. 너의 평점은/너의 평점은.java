import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		// 학점 * 과목평점
		double sum = 0;
		// 총학점
		double total = 0;
		
		// 20과목 반복문
		for(int i = 0; i < 20; i ++) {
			// 과목(Title)
			String title = sc.next();
			// 학점(Credit)
			double credit = sc.nextDouble();
			// 평점(Grade)
			String grade = sc.next(); 
			
			
			if(grade.equals("A+")) {
				sum += credit * 4.5;
				total += credit;
			} else if(grade.equals("A0")) {
				sum += credit * 4.0;
				total += credit;
			} else if(grade.equals("B+")) {
				sum += credit * 3.5;
				total += credit;
			} else if(grade.equals("B0")) {
				sum += credit * 3.0;
				total += credit;
			} else if(grade.equals("C+")) {
				sum += credit * 2.5;
				total += credit;
			} else if(grade.equals("C0")) {
				sum += credit * 2.0;
				total += credit;
			} else if(grade.equals("D+")) {
				sum += credit * 1.5;
				total += credit;
			} else if(grade.equals("D0")) {
				sum += credit * 1.0;
				total += credit;
			} else if(grade.equals("F")) {
				sum += credit * 0.0;
				total += credit;
			}
		}// for end
	
		// 전공평점
		double result = sum / total;
			
		System.out.printf("%.6f", result);
	}
}