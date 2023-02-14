package ch07;

public class Student {
	
	// 학번과 이름을 정의
	private String name; 
	private int id; 
	// 생성자 
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// 1
	// toString --> 학번, 이름이 화면에 출력할 수 있도록 설계
	@Override
	public String toString() {
		return this.name + ", " + this.id; 
	}
	
	// 2 
	// equals 메서드를 재 정의 해주세요 !! 
	// 이름이 같아면 동명이인입니다라고 출력해 주세요 !!!
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student targetStudent = (Student)obj; 
			if(this.name == targetStudent.name) {
				System.out.println("이름이 같아요~");
				return true; 
			}
		}
		return false;
	}
	
	// 3 해쉬코드 메서드도 호출해보세요 
}


