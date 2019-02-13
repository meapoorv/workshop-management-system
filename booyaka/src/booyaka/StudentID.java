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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentID extends JFrame {
	public StudentID()
	{
		setLayout(null);

		ImageIcon nw=new ImageIcon("bg.jpg");
		JLabel lblBG1 = new JLabel(nw);
		lblBG1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		add(lblBG1);
	
	
		

JLabel Lbluid = new JLabel("User-ID");
Lbluid.setBounds(10,30,300,30);
Lbluid.setForeground(Color.WHITE);
Font aa=new Font("arial",Font.BOLD,25);
Lbluid.setFont(aa);
lblBG1.add(Lbluid);

JTextField txtnoa = new JTextField();
txtnoa.setBounds(220,30,150,25);
add(txtnoa);

JLabel Lblpd = new JLabel("Password");
Lblpd.setBounds(10,70,300,30);
Lblpd.setForeground(Color.WHITE);
Font ab=new Font("arial",Font.BOLD,25);
Lblpd.setFont(ab);
lblBG1.add(Lblpd);

JTextField txtn = new JTextField();
txtn.setBounds(220,70,150,25);
add(txtn);

JButton btnlog=new JButton("LOGIN");
btnlog.setBounds(70, 100, 100, 30);
lblBG1.add(btnlog);

btnlog.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Entry e=new Entry();
		
		String usr=txtnoa.getText();
		String pwd=txtn.getText();
	e.user=usr;
	e.pwd=pwd;
		
		Boolean x=false;
		DBHandler obj=new DBHandler();
		x=obj.getstudent(usr,pwd);
		if(x=true){
			WorkshopDetails frm=new WorkshopDetails();
			dispose();
		}
		else{
			JOptionPane.showMessageDialog(null, "ENTER VALID ID AND PASSWORD!!!!!!");
		}
		
		
	}
	
});


JButton btnc=new JButton("Create-NewID");
btnc.setBounds(100, 150, 130, 40);
lblBG1.add(btnc);
btnc.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		Student frm =new Student();
		dispose();
	
	}
	
});



JButton btnc1=new JButton("Back");
btnc1.setBounds(100, 550, 130, 40);
lblBG1.add(btnc1);	

btnc1.addActionListener(new ActionListener(){


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 MainFrame frm =new MainFrame();
		dispose();
	}
	
});		
		

setTitle("StudentID");
setVisible(true);
setSize(Toolkit.getDefaultToolkit().getScreenSize());
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
