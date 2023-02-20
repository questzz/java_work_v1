package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame extends JFrame {

	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// 초기값 셋팅
		labelTextX = 300;
		labelTextY = 350;

		labelText = new JLabel("Hello World~");
		labelText.setSize(100, 100);
	}

	private void setInitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					labelText.setLocation(labelTextX += 50, labelTextY);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					labelText.setLocation(labelTextX -= 50, labelTextY);
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					labelText.setLocation(labelTextX, labelTextY -= 50);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					labelText.setLocation(labelTextX, labelTextY += 50);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}

}
