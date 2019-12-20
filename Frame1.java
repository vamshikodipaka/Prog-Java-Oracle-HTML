import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame1 extends JFrame implements ActionListener{
	JButton b2;
	JLabel no1 = new JLabel("<html>THIS APPLICATION IS <br/>USED TO CHECK UR MARKS AND GRADES</html>");
	public Frame1() {
		super("Examination Result");
		this.setContentPane(new JLabel(new ImageIcon(
				this.getClass().getResource("/welcome_pic.jpg"))));
		
		setLayout(null);
		no1.setForeground(Color.RED);
		no1.setBounds(100,200,1000,100);
		no1.setFont(new Font("Candara", Font.BOLD,25));
		Icon warnIcon = new ImageIcon(this.getClass().getResource("/next2.png"));
		b2 = new JButton(warnIcon);
		//b2 = new JButton("enter");
		b2.setBounds(200, 300, 80, 80);
		add(no1);
		add(b2);
		b2.addActionListener(this);
		setVisible(true);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b2){
			
				Frame3 f2 = new Frame3();
				
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f2.setSize(1368,768);
				f2.setVisible(true);
			}
		}
}
