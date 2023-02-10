package ch09;

import java.util.Scanner;

public class BookStoreManager {
	
	public static void main(String[] args) {
		
		
	// 도구 준비 
	Scanner scanner = new Scanner(System.in);
	// 먼저 몇칸 사용할지 정해 주어야 한다. 
	Book[] books = new Book[100];
	String userInput = null;
	boolean flag = true; 
	
	while(flag == true) {
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1 .    2 .   3 .  4.  0 종료 ");
		userInput = scanner.nextLine(); 
		if(userInput.equals("0")) {
			// 프로그램 종료
			flag = false; 
			System.out.println("시스템 종료");
		}
	}
		
		
	} // end of main 
}
