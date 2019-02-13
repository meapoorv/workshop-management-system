package booyaka;


import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Student extends JFrame{

	public Student(){
		setLayout(null);
		ImageIcon icnBG=new ImageIcon("www.jpg");
		  JLabel lblBG = new JLabel(icnBG);
		  lblBG.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		  add(lblBG);
		  
	      int yLbl[]={40,90,140,210,260};	  
	      JLabel arrLbl[]=new JLabel[5];
	      String strLblnm[]={"Roll No :","Name :","Password :","Mobile No :","E-Mail :"};
		  for(int i=0;i<5;i++){
			  arrLbl[i]=new JLabel(strLblnm[i]);
			  arrLbl[i].setBounds(50, yLbl[i], 150, 40);
			  Font f=new Font("arial",Font.BOLD,35);
			  arrLbl[i].setFont(f);
			
			lblBG.add(arrLbl[i]);
			
		}
		JTextField arrTxt[]=new JTextField[5];
		int yposTxt[]={50,90,140,210,260};
		for (int i=0;i<5;i++)
		{
			arrTxt[i] = new JTextField();
			arrTxt[i].setBounds(310,yposTxt[i],150,30);
			add(arrTxt[i]);
			
		}
	
		
		JButton btn =new JButton("Register");
		btn.setBounds(800,600,150,40);
		lblBG.add(btn);

		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String strUnm=arrTxt[4].getText();
				boolean res2=ClsValidation.isValidEmail(strUnm);
				if(res2==true)
					{
						JOptionPane.showMessageDialog(null, "valid email");
					}
					else
					{
				JOptionPane.showMessageDialog(null,"Please enter the valid email","Error",JOptionPane.ERROR_MESSAGE);
					}

			
			String strUnm1=arrTxt[3].getText();
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
			 String strUnm2=arrTxt[0].getText();
				boolean res4= ClsValidation.isNumber(strUnm2);
				if(res4==true)
				{
					JOptionPane.showMessageDialog(null, "valid number");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter the valid number","Error",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			      String strUnm3=arrTxt[1].getText();
					boolean res5= ClsValidation.isTextEntered(strUnm3);
					if(res5==true)
					{
						JOptionPane.showMessageDialog(null, "ok");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter the text","Error",JOptionPane.ERROR_MESSAGE);
					}
					
					if(res5==true||res4==true||res2==true||res1==true){
					String strRollNo,strName,strPassword,strMobileNo,strEmailID;
					strRollNo=arrTxt[0].getText();
					strName=arrTxt[1].getText();
					strPassword=arrTxt[2].getText();
					strMobileNo=arrTxt[3].getText();
					strEmailID= arrTxt[4].getText();
					DBHandler objDB=new DBHandler();
					objDB.stdid(strRollNo,strName,strPassword,strMobileNo,strEmailID);
					

					JOptionPane.showMessageDialog(null, "ID CREATED");
					dispose();
					StudentID stdid=new StudentID();
				}}
			
		
		});
	
		
		setTitle("Student");
		setVisible(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		

		}

}