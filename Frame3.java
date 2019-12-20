import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame3 extends JFrame implements ActionListener{
	
	JLabel jl1 = new JLabel("SELECT YOUR STREAM RESULT");
	JButton b1;
	JButton b2;
	JButton b3;
	
	Frame3(){
		
		super("BRANCH DETAILS");
		this.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/welcome_pic.jpg"))));
		setLayout(null);
		jl1.setFont(new Font("Candara", Font.BOLD,25));
		jl1.setForeground(Color.RED);
		jl1.setBounds(400, 150, 400, 50);
		Icon warnIcon1 = new ImageIcon(this.getClass().getResource("/mca.jpg"));
		Icon warnIcon2 = new ImageIcon(this.getClass().getResource("/Btech.jpg"));
		Icon warnIcon3 = new ImageIcon(this.getClass().getResource("/Mtech.jpg"));
		b1= new JButton(warnIcon1);
		b2 = new JButton(warnIcon2);
		b3 = new JButton(warnIcon3);
		
		/*b1.setForeground(Color.PINK);
		b2.setForeground(Color.BLACK);
		b3.setForeground(Color.RED);*/
		
		b1.setBounds(500,200,150,80);
		b2.setBounds(500,300,150,85);
		b3.setBounds(500,420,150,80);
		
		add(jl1);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
		
			Frame2 f2 = new Frame2();
			
			f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f2.setSize(2000,1500);
			f2.setVisible(true);
		}
		else if(e.getSource() == b2){
			//calling frame4--> coping the code from frame2 to frame4
			//dont forget to create file and write some data for btech
		}
		else if(e.getSource() == b3){
			//calling frame5--> coping the code from frame2 to frame5
			//dont forget to create file and write some data for mtech
		}
		
	}

}
