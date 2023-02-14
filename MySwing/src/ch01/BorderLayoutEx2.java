package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2  extends JFrame {
	// 배열과 for문 활용해서 코드 수정 
	//String[] direction = new String[5];
	// 변수 선언과 동시에 초기화 !!
	String[] direction = {BorderLayout.EAST, BorderLayout.WEST,
			BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.CENTER};
	JButton[] buttons = new JButton[5];
	
	public BorderLayoutEx2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("borderlayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(direction[i]);
		}
	}
	
	private void setInitLayout() {
		// setLayout(new BorderLayout());  // 기본 레이웃은 BorderLayout 이다. 
		// borderLayout , 매개변수 값 하나를 더 추가 시킬 수 있다. (방향 지정가능) 
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], direction[i]);
		}
		setVisible(true);
	}
	
	// 코드 테스트 
	public static void main(String[] args) {
		new BorderLayoutEx2();
	} // end of main 
}






