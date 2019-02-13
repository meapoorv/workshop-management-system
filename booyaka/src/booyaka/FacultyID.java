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

public class FacultyID extends JFrame {

	public FacultyID(){
		
		setLayout(null);

		ImageIcon id=new ImageIcon("bg.jpg");
		JLabel lblBG1 = new JLabel(id);
		lblBG1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		add(lblBG1);
	

		JLabel Lblpd = new JLabel("First-Name : ");
		Lblpd.setBounds(10,70,300,30);
		Lblpd.setForeground(Color.WHITE);
		Font ab=new Font("arial",Font.BOLD,25);
		Lblpd.setFont(ab);
		lblBG1.add(Lblpd);

		JTextField txtn = new JTextField();
		txtn.setBounds(220,70,150,25);
		lblBG1.add(txtn);

		
		JLabel Lblln = new JLabel("Password :");
		Lblln.setBounds(10,110,300,30);
		Lblln.setForeground(Color.WHITE);
		Font ac=new Font("arial",Font.BOLD,25);
		Lblln.setFont(ac);
		lblBG1.add(Lblln);

		JTextField txtn1 = new JTextField();
		txtn1.setBounds(220,110,150,25);
		add(txtn1);

		
		JLabel Lblmn = new JLabel("Mobile no  :");
		Lblmn.setBounds(10,150,300,30);
		Lblmn.setForeground(Color.WHITE);
		Font ad=new Font("arial",Font.BOLD,25);
		Lblmn.setFont(ad);
		lblBG1. add(Lblmn);

		JTextField txtn2 = new JTextField();
		txtn2.setBounds(220,150,150,25);
		add(txtn2);
		
		JLabel Lblln1 = new JLabel("Email ID :");
		Lblln1.setBounds(10,190,300,30);
		Lblln1.setForeground(Color.WHITE);
		Font ar=new Font("arial",Font.BOLD,25);
		Lblln.setFont(ar);
		lblBG1.add(Lblln1);

		JTextField txtnM= new JTextField();
		txtnM.setBounds(220,190,150,25);
		add(txtnM);
		JButton ba=new JButton("Register");
		ba.setBounds(100, 300, 130, 40);
		lblBG1.add(ba);
		ba.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				
				String strUnm=txtnM.getText();
				boolean res2=ClsValidation.isValidEmail(strUnm);
				if(res2==true)
					{
						JOptionPane.showMessageDialog(null, "valid email");
					}
					else
					{
		JOptionPane.showMessageDialog(null,"Please enter the valid email","Error",JOptionPane.ERROR_MESSAGE);
					}
				
				String strUnm1=txtn2.getText();
				boolean res1=ClsValidation.isValidMobNo(strUnm1);
				
 			JOptionPane.showMessageDialog(null, strUnm1.length());
			if(res1==true)
					{
						JOptionPane.showMessageDialog(null, "valid MOB NO");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter the valid MOB NO","Error",JOptionPane.ERROR_MESSAGE);
					}
				
				
				if(res1==true||res2==true){
				String strFirstName,strPassword,strMobileNo,strEmailID;
				strFirstName=txtn.getText();
				strPassword=txtn1.getText();
				strMobileNo=txtn2.getText();
				strEmailID= txtnM.getText();
				DBHandler objDB=new DBHandler();
				objDB.Facid(strFirstName,strPassword,strMobileNo,strEmailID);
				

				JOptionPane.showMessageDialog(null, "ID CREATED");
				dispose();
				
				faculty fac =new faculty();
			}
			else{
				JOptionPane.showMessageDialog(null,"Please enter the valid details","Error",JOptionPane.ERROR_MESSAGE);
			}
		}});
		
		
		


setTitle("Faculty ID");
setVisible(true);
setSize(Toolkit.getDefaultToolkit().getScreenSize());
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	}
	
}