package strings;

public class StringTest1 {

	public static void main(String[] args) {
		// 문자열이 이라는 데이터를 사용할 때
		
 		String str1 = "반가워";   // 1번 방식  --> 상수 풀 영역에 올라 간다. 
		String str2 = new String("반가워"); // 2번 방식 --> 동적 메모리 영역에 올라 간다. 
		String str3 = new String("반가워"); // ?? 질문 str2 와 str3은 주소값이 같을 까요? 
		String str4 = "반가워";  // ?? str1 과 str4 주소값이 같을까요??
				
		
		// 값을 출력해 보자. 
		System.out.println("str1" + str1);
		System.out.println("str2" + str2);
		
		// 1번 방식과 2번 방식은 메모리 위치 시키는 곳이 다르다. 
		// == 연산은  값을 비교(기본 데이터 타입) ,  클래스 타입은 주소값을 비교 한다. 
		
		// 검증하기 
		if(str1 == str2) {
			System.out.println("주소값이 같아요~");
		} else {
			System.out.println("아니요 주소값이 달라요~");
		}
		System.out.println("---------------------");
		// 검증 하기 2 
		if(str2 == str3) {
			System.out.println("주소값이 같아요~");
		} else {
			System.out.println("아니요 주소값이 달라요~");
		}
		
		System.out.println("---------------------");
		// 검증 하기 3 
		if(str1 == str4) {
			System.out.println("주소값이 같아요~");
		} else {
			System.out.println("아니요 주소값이 달라요~");
		}
		
		// 결론 
		// 리터럴 값으로 생성한 문자열은 상수 풀 이라는 영역에 올라가고 
		// 동일한 문자열을 사용한다면 새로 생성하지 않고 재활용하여 사용한다. 
		
		System.out.println("---------------------");
		// 검증 하기 4
		if(str1.equals(str2)) {
			System.out.println("문자열 모양이 같아요");
		} else {
			System.out.println("문자열 모양이 달라요");
		}
		
		
		
		
		
	} // end of main 

} // end of class 
