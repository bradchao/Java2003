package tw.org.iii.java2003;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	private boolean isRunning;

	public Racing(){
		super("Racing Game");
		setLayout(new GridLayout(lanes.length+1, 1));
		
		go = new JButton("Go!"); add(go);
		for (int i=0; i<lanes.length; i++){
			JLabel lane = new JLabel((i+1) + ". ");
			lanes[i] = lane;
			add(lane);
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go(){
		if (!isRunning){
			isRunning = true;
			rank = 1;
			for (int i=0; i<lanes.length; i++){
				lanes[i].setText((i+1) + ". ");
			}
			for (int i=0; i<cars.length; i++){
				cars[i] = new Car(i);
			}
			for (int i=0; i<cars.length; i++){
				cars[i].start();
			}
		}
	}

	private void stopGame(){
		for (Car car : cars){
			car.interrupt();
		}
		isRunning = false;
	}
	
	private class Car extends Thread {
		private int lane;
		Car(int lane){this.lane=lane;}
		@Override
		public void run() {
			for (int i=0; i<100; i++){
				lanes[lane].setText(lanes[lane].getText() + ">");
				try {
					Thread.sleep(10 + (int)(Math.random()*200));
				} catch (InterruptedException e) {
					return;
				}
			}
			lanes[lane].setText(lanes[lane].getText() + "==> WINNER");
			stopGame();
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}


