package ch05;

import java.util.Scanner;

// 클래스를 사용하는 쪽 코드 작성 
public class UserMainTest2 {
 
	// 메인 함수 
	public static void main(String[] args) {
		// 테스트 코드 
		Scanner scanner = new Scanner(System.in);
		int userInput1 = scanner.nextInt();
		// nextInt() 개행문자 제거 하지 않았기 때문에 
		// 바로 아래 코드가 동작하고 완료 되어진다.
		System.out.println(userInput1);
		scanner.nextLine();
		// 입력 창치 (키보드값을 받아주는 객체) 
		// 정수 값을 입력 받을 때 
		int a = scanner.nextInt(); 
		// 100 + 엔터(개행문자 \n)  
		scanner.nextLine(); // <-- 엔터키 소화 
		
		User userLee = new User(); 
		User userKim = new User();
		// 화면에 뿌리기 
		
	} // end of main 
	
} // end of class 
