package booyaka;


import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame{
public MainFrame(){
	setLayout(null);
	
	ImageIcon icnBG=new ImageIcon("bg.jpg");
	  JLabel lblBG = new JLabel(icnBG);
	  lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	 
	  add(lblBG);

		JLabel nm=new JLabel("JMIT");
			nm.setBounds(50,0,900,200);
			nm.setForeground(Color.white);
	
			Font f=new Font("arial",Font.BOLD,65);
			nm.setFont(f);
			lblBG.add(nm);

			
			JLabel reg=new JLabel("REGISTRATION:");
			reg.setBounds(50,420,900,200);
			reg.setForeground(Color.white);
			Font g=new Font("arial",Font.BOLD,65);
			reg.setFont(g);
			lblBG.add(reg);
		
		JButton btnnew=new JButton("New User");
		btnnew.setBounds(100, 600, 130, 30);
		lblBG.add(btnnew);
		btnnew.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				//Loginframe frm =new Loginframe();
				Register frm =new Register();
			}
			
		});
		
				
		JButton btnsdt=new JButton("Student");
		btnsdt.setBounds(300, 600, 130, 30);
		lblBG.add(btnsdt);
		
		btnsdt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				StudentID stdid =new StudentID();
				dispose();
			}
			
		});
		
		JButton btnfaculty=new JButton("Faculty");
		btnfaculty.setBounds(500, 600, 130, 30);
		lblBG.add(btnfaculty);
		
		btnfaculty.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				faculty fac =new faculty();
				dispose();
			}
			
		});
		
		JButton btnadmin=new JButton("Admin");
		btnadmin.setBounds(700, 600, 130, 30);
		lblBG.add(btnadmin);
		btnadmin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			//	Admin amn=new Admin();
				//Rform frm = new Rform();
				AdminRegister frm =new AdminRegister();
				dispose();
				//Loginframe frm =new Loginframe();
			}
			
		});
		
	setTitle("JMIT");
	setVisible(true);
	setSize(Toolkit.getDefaultToolkit().getScreenSize());
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}


