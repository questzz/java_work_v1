package ch07;

public class MainTest5 {
	
	public static void main(String[] args) {
		String str = "TEST";
		// 문자열 교체 기능이 있는가??? 
		// TEST <-- ST --> AB 
		// TEST ---> 
	 	String reuslt1 =  str.replace("ST", "AB");
	 	System.out.println("result : " + reuslt1);
		
	}
}
