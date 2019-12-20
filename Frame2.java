import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Frame2 extends JFrame implements ActionListener{
	JLabel no1 = new JLabel("ENTER HALL TICKET NUMBER:");
	JLabel no2 = new JLabel("RESULT IS: ",JLabel.CENTER);
	
	JTextField f1 = new JTextField();
	
	JLabel no3 = new JLabel();
	JButton b;
	JButton b1;
	 
	Frame2(){
		
		
		super("Examination Result2");
		this.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/welcome_pic.jpg"))));
		
		setLayout(null);
		//setLayout(new FlowLayout());
		no1.setForeground(Color.RED);
		no3.setForeground(Color.RED);
		
		
		no2.setForeground(Color.RED);
		f1.setBackground(Color.PINK);
		f1.setForeground(Color.RED);
		Icon warnIcon = new ImageIcon(this.getClass().getResource("/next2.png"));
		//b=new JButton("CHECK");
		b=new JButton(warnIcon);
		b.setForeground(Color.RED);
		Icon warnIcon1 = new ImageIcon(this.getClass().getResource("/back.jpg"));
		//b1=new JButton("BACK");
		b1=new JButton(warnIcon1);
		b1.setForeground(Color.RED);
		
		f1.setToolTipText("Ex : AB12BN1201");
		f1.setBounds(450,190,150,20);
		b.setBounds(400, 280, 80, 80);
		b1.setBounds(500, 280, 120, 80);
		no1.setBounds(100,150,500,100);
		no2.setBounds(75,400,150,70);
		no3.setBounds(100,450,1300,70);
		no1.setFont(new Font("Candara", Font.BOLD,25));
		no2.setFont(new Font("Candara", Font.BOLD,25));
		no3.setFont(new Font("Candara", Font.BOLD,25));
		
		b.addActionListener(this);
		b1.addActionListener(this);
		add(no1);
		add(f1);
		add(b1);
		add(b);
		add(no2);
		add(no3);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1){
			this.dispose();
		}
		
		BufferedReader br=null;
		String s=null;
		String s11=null;
		
		try {
			br = new BufferedReader(new FileReader("src/result.text"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String ehno=f1.getText();//AB12BN1201
		Pattern p= Pattern.compile("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$");
		for(int i=0;i<15;i++){
			
			try {
				s = br.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			StringTokenizer st = new StringTokenizer(s," ");
			float total = 0;
			String hno = st.nextToken();//hallticket number
			
			Matcher m = p.matcher(ehno);
			if(m.matches()){
				if(hno.equals(ehno)){
						String s1= st.nextToken();//student name
						int j[]=new int[6];
						int k=0;
						while(st.hasMoreTokens()){
							j[k] =  Integer.parseInt(st.nextToken());
							k++;
						}//inner while
						int tm=0;
						for(int l=0;l<6;l++){
								tm = tm+j[l];
						}//for
						total = tm;
						s11 ="HI "+s1+" YOUR HALL TICKET NUMBER IS: "+hno+ "  AND THE TOTAL MARKS ARE: "+total;
						int grade=(int)total/6;
						if(grade >=0 && grade <=59){
								s11=s11+"  YOUR GRADE IS:  "+'E';
						}
						else if(grade >=60 && grade <=69){
								s11=s11+" YOUR GRADE IS:  "+'D';
							}
						else
							if(grade >=70 && grade <=79){
								s11=s11+" YOUR GRADE IS:  "+'C';
							}
							else	
								if(grade >=80 && grade <=89){
									s11=s11+" \nYOUR GRADE IS:  "+'B';
								}
									
								else    
									if(grade >=90 && grade <=100){
										s11=s11+" YOUR GRADE IS:  "+'A';
									}
						no3.setText(s11);
						break;
					
				}
				else{
					s11="INVALID HALL TICKET NUMBER";
					no3.setText(s11);
				}
			}else{
				s11="INVALID HALL TICKET NUMBER";
				no3.setText(s11);
			}
			}
			
		}
	}
	
