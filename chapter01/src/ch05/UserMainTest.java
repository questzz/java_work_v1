package ch05;

import java.util.Scanner;

// 클래스를 사용하는 쪽 코드 작성 
public class UserMainTest {
 
	// 메인 함수 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput1 = scanner.nextInt();
		// nextInt() 개행문자 제거 하지 않았기 때문에 
		// 바로 아래 코드가 동작하고 완료 되어진다. 
		System.out.println(userInput1);
		scanner.nextLine();
		
		System.out.println("이름을 입력해주세요");
		String name =  scanner.nextLine();
		System.out.println("name : " + name);
		
		
		// 메모리 올리고 
		// 값을 할당 
		// 화면에 값을 출력 
		
	} // end of main 
	
} // end of class 
