package ch12;

public class MainTest1 {

	public static void main(String[] args) {
		// 기본 적으로 추상 클래스는 new 할 수 없다.
		// abstract --> 개발자 한테 직접 new 를 막아 버림 
		// Animal animal = new Animal();  <- 추상 클래스   
		Animal animalHuman = new Human(); 
		animalHuman.hunt();
		System.out.println("----------------");
		Animal animalPerson = new Person();
		animalPerson.hunt(); // 런타임 시점에 누구의 메서드 person에 메서들 호출한다. 
		
		
	}

}
