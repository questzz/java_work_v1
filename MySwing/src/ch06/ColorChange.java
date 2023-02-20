package ch06;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener {
	
	private JPanel panel; 
	private JButton button1; 
	private JButton button2; 
	
	public ColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("click1");
		button2 = new JButton("click2");
	}
	private void setInitLayout() {
		// Frame -> borderLayout
		add(panel);
		panel.setBackground(Color.yellow);
		panel.add(button1);
		panel.add(button2);
		setVisible(true);
		new Color(1231);
	}
	private void addEventListener() {
		// this -> ColorChange --> ActionListener 타입으로 바라 볼 수 있다. 
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	// 테스트 코드 
	public static void main(String[] args) {
		new ColorChange();
	} // end of main 
	
	// 약속 되어진 메서드 
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출 시켜준다. 
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() --> Object 
		// 다운 캐스팅 버튼으로 코드 작성 
		JButton targetButton = (JButton)e.getSource();
		// targetButton.setText("눌러짐 버튼입니다.");
		// System.out.println(targetButton.getText());
		
//		System.out.println(e.getSource());
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.gray);
//		}  else {
//			panel.setBackground(Color.yellow);
//		}
		
		// 문제 1 
		// 문자열을 비교해서 색상 변경 시키는 코드를 작성해 주세요 
		if(targetButton.getText().equals(this.button1.getText())) {
			// click1 == click1 
			panel.setBackground(Color.gray);
		} else {
			panel.setBackground(Color.yellow);
		}
		
	}

} // end of class 
