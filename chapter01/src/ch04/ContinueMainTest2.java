package ch04;

import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {
	
		// 스캐너를 사용해서 사용자에 정수 값을 입력 받아서 배수에 갯수를 
		// 출력하는 프로그램을 만들어 보세요 
		// 테스트 값은 1000 , (3을 입력하면 안에 배수가 몇개 있을까요?)
		
		// 1. 스캐너 선언 하기 
		// 2. 변수 결정하기 
		// 3. 식 만들어 보기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		final int MULTIPLE = sc.nextInt();
		System.out.println("몇까지 확인 하겠습니까?");
		final int MAX =  sc.nextInt();
		
		int num = 0; 
		int count = 0; 
		
		for(num = 1; num <= MAX; num++) {
			// 만약 3에 배수이면 화면에 출력하지 마시오 
			if(num % MULTIPLE == 0) {
				// count = count + 1;
				count++;
				continue;
			}
			// System.out.println(" num : " + num);
		}
		
		System.out.println(MULTIPLE + " 의 배수에 갯수는 " + count + " 입니다.");
	} // end of main 

} // end of class 
