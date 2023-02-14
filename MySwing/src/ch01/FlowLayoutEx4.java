package ch01;

import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame {

	private JButton[] buttons = new JButton[5]; // 배열 선언 방법에  이해!
	// 생성자는 메모리에 올라 갈 때 처음 실행 되는 코드 
	// 구현부 안에서 순서도 중요 합니다! 
	public FlowLayoutEx4() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("배열활용");
		setSize(600, 600);
		// static 변수나 static 함수는 클래스 이름으로도!! 접근 가능합니다 !! 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < buttons.length; i ++) {
			buttons[i] = new JButton("button" + (i + 1));
		}
		
	}
	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		for(int i = 0; i < buttons.length; i++) {
			// 방어적 코드 작성 염두!! 
			add(buttons[i]);
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx4();
	}
}
