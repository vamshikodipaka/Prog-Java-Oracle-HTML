import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyFrame extends JFrame{

	JLabel jl;
	JButton jb;
	JTextField f1 = new JTextField();
	MyFrame(){
		super("this my frame");
		System.out.println("this myframe construcotr");
		this.setContentPane(new JLabel(new ImageIcon(
				this.getClass().getResource("/welcome_pic.jpg"))));
		
		jl = new JLabel("THIS FIRST SWING PROGRAM");
		
		setLayout(null);
		jl.setForeground(Color.RED);
		jl.setBounds(100,200,350,100);
		jl.setFont(new Font("Candara", Font.BOLD,25));
		add(jl);
		Icon warnIcon = new ImageIcon(this.getClass().
									getResource("/next2.png"));
		//jb = new JButton("click");
		jb = new JButton(warnIcon);
		jb.setBounds(200, 400, 80, 80);
		add(jb);
		f1.setToolTipText("Ex : AB12BN1201");
		f1.setBounds(450,190,150,20);
		add(f1);
	}
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		//mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setSize(1360, 650);
		mf.setVisible(true);
	}

}
