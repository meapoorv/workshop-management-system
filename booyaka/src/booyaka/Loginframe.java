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

public class Loginframe extends JFrame {
	public Loginframe()
	{
setLayout(null);

ImageIcon nw=new ImageIcon("bg.jpg");
JLabel lblBG1 = new JLabel(nw);
lblBG1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
add(lblBG1);


JLabel nm2=new JLabel("WORKSHOP");
	nm2.setBounds(600,10,900,200);
	nm2.setForeground(Color.white);
	Font f=new Font("arial",Font.BOLD,65);
	nm2.setFont(f);
	lblBG1.add(nm2);
	
	JLabel arrLbl[]=new JLabel[10];
	int yposLbl[]={30,70,110,150,190,230,270,310,350,390};
	String strLblnm[]={"CompanyName","Subject","Dates","Duration","Is_Paid","Student_Limit","Faculty","Amount","CompanyId","Workshop_Id"};
	for(int i=0;i<10;i++){
		
		 arrLbl[i]= new JLabel(strLblnm[i]);
		 arrLbl[i].setBounds(10, yposLbl[i], 180, 25);
		 arrLbl[i].setForeground(Color.white);
		 Font c=new Font("arial",Font.ITALIC,25);
		  arrLbl[i].setFont(c);
		
		lblBG1.add(arrLbl[i]);

		}
	JTextField arrTxt[]=new JTextField[10];
	int yposTxt[]={30,70,110,150,190,230,270,310,350,390};
	for (int i=0;i<10;i++)
	{
		arrTxt[i] = new JTextField();
		arrTxt[i].setBounds(220,yposTxt[i],150,25);
		add(arrTxt[i]);
		
	}
	
	

	JButton ba=new JButton("Apply");
	ba.setBounds(100, 500, 130, 40);
	lblBG1.add(ba);
	ba.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			 String strUnm=arrTxt[2].getText();
				boolean res4= ClsValidation.isNumber(strUnm);
				if(res4==true)
				{
					JOptionPane.showMessageDialog(null, "valid number");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter the valid number","Error",JOptionPane.ERROR_MESSAGE);
				}
				 String strUnm2=arrTxt[3].getText();
					boolean res2= ClsValidation.isNumber(strUnm2);
					if(res4==true)
					{
						JOptionPane.showMessageDialog(null, "valid number");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter the valid number","Error",JOptionPane.ERROR_MESSAGE);
					}
					 String strUnm3=arrTxt[3].getText();
						boolean res3= ClsValidation.isNumber(strUnm3);
						if(res4==true)
						{
							JOptionPane.showMessageDialog(null, "valid number");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Please enter the valid number","Error",JOptionPane.ERROR_MESSAGE);
						}
					if(res4==true||res3==true||res2==true){
			String strCompanyName,strSubject,strDates,strDuration,strIs_Paid,strStudent_Limit,strFaculty,strAmount,strCompanyId,strWorkshop_Id;
			strCompanyName=arrTxt[0].getText();
			strSubject=arrTxt[1].getText();
			strDates=arrTxt[2].getText();
			strDuration= arrTxt[3].getText();
			strIs_Paid= arrTxt[4].getText();
			strStudent_Limit= arrTxt[5].getText();
			strFaculty= arrTxt[6].getText();
			strAmount= arrTxt[7].getText();
			strCompanyId=arrTxt[8].getText();
			strWorkshop_Id=arrTxt[9].getText();
			DBHandler objDB=new DBHandler();
			
			objDB.getworkshop(strCompanyName,strSubject,strDates,strDuration,strIs_Paid,strStudent_Limit,strFaculty,strAmount,strCompanyId,	strWorkshop_Id);
			

			JOptionPane.showMessageDialog(null, "Applied");
			dispose();
			
			Register frm =new Register();
		}}
	});

	
	JButton jjj =new JButton("Aprroved Workshop");
	jjj.setBounds(800,600,150,40);
	lblBG1.add(jjj);
	jjj.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			ApprovedStatus frm=new ApprovedStatus();
		}
		
	});
	
setTitle("Loginframe");
setVisible(true);
setSize(Toolkit.getDefaultToolkit().getScreenSize());
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}