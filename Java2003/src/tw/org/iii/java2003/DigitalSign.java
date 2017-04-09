package tw.org.iii.java2003;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalSign extends JFrame {
	private JButton clear, undo, redo, save, open;
	private MySignPanel msp;
	
	public DigitalSign(){
		super("Digital Sign");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear"); undo = new JButton("Undo"); redo = new JButton("Redo");
		JPanel top = new JPanel(new FlowLayout()); top.add(clear);top.add(undo); top.add(redo);
		add(top, BorderLayout.NORTH);
		
		msp = new MySignPanel();
		add(msp, BorderLayout.CENTER);
		
		setSize(640,  480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new DigitalSign();
	}

}
