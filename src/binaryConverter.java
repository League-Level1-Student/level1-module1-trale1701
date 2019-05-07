import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	public static void main(String[] args) {
		binaryConverter bc = new binaryConverter();
		bc.random();
	}
	
	public void random () {
			JFrame f = new JFrame();
		f.setVisible(true);
		JPanel p = new JPanel();
		b.addActionListener(this);
		l.setVisible(true);
		p.add(l);
		p.add(b);
		p.add(tf);
		f.add(p);
		f.pack();
		
		
	}
JButton b = new JButton("convert");
JLabel l = new JLabel();
JTextField tf = new JTextField(20);	


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == b) {
			String input = tf.getText();
			l.setText(convert(input));
			
		}
	}
	     String convert(String input) {
	          if(input.length() != 8){
	               JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	               return "-";
	          }
	          String binary = "[0-1]+";    //must contain numbers in the given range
	          if (!input.matches(binary)) {
	               JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	               return "-";
	          }
	          try {
	               int asciiValue = Integer.parseInt(input, 2);
	               char theLetter = (char) asciiValue;
	               return "" + theLetter;
	          } catch (Exception e) {
	               JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	               return "-";
	          }
	     }
	}

