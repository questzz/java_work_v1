package ch03;

public class MainTest3 {

	// 메인 함수 (메인 쓰래드)
	public static void main(String[] args) {
		// 복합 대입 연산자 
		// 다른 연산자와 대입 연산자를 함께 사용하는 것 
		int num1 = 1; 
		num1 = num1 + 10;   // 1 
		System.out.println(num1);
		
		int num2 = 1; 
		num2 += 10; // 1번을 간소화 한 것 
		System.out.println(num2);
		
		int num3 = 1; 
		//num3 = num3 - 10; 
		num3 -= 10; 
		System.out.println(num3);
		
		// 문제 복합 대입 연산자로 변경해 주세요 
		num1 = num1 * 2;
		num1 *= 2; 
		
		// 변경 하기 
		num2 = num2 / 2; 
		num2 /= 2; 
		
		// 변경 하기 
		num2 = num2 % 2; 
		num2 %= 2; 

	} // end of main

} // end of class 
