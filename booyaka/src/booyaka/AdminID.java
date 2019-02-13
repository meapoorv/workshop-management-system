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

public class AdminID extends JFrame{
public AdminID()
{

	setLayout(null);

	ImageIcon nd=new ImageIcon("ag.jpg");
	JLabel lblBG1 = new JLabel(nd);
	lblBG1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	add(lblBG1);


	JLabel Lblusr = new JLabel("Name : ");
	Lblusr.setBounds(10,30,300,30);
	Lblusr.setForeground(Color.WHITE);
	Font abk=new Font("arial",Font.BOLD,25);
	Lblusr.setFont(abk);
	lblBG1.add(Lblusr);
	

JTextField txtnk = new JTextField();
txtnk.setBounds(320,30,150,30);
add(txtnk);

JLabel Lblpwd = new JLabel("Password : ");
Lblpwd.setBounds(10,70,300,30);
Lblpwd.setForeground(Color.WHITE);
Font abd=new Font("arial",Font.BOLD,25);
Lblpwd.setFont(abd);
lblBG1.add(Lblpwd);

JTextField txtnsk= new JTextField();
txtnsk.setBounds(320,70,150,30);
add(txtnsk);


JLabel Lblrol = new JLabel("ARoll : ");
Lblrol.setBounds(10,110,300,30);
Lblrol.setForeground(Color.WHITE);
Font bd=new Font("arial",Font.BOLD,25);
Lblrol.setFont(bd);
lblBG1.add(Lblrol);

JTextField txtnas= new JTextField();
txtnas.setBounds(320,110,150,30);
add(txtnas);

JLabel Lblud = new JLabel("Auid : ");
Lblud.setBounds(10,150,300,30);
Lblud.setForeground(Color.WHITE);
Font bda=new Font("arial",Font.BOLD,25);
Lblud.setFont(bda);
lblBG1.add(Lblud);

JTextField txtns= new JTextField();
txtns.setBounds(320,150,150,30);
add(txtns);


JButton ba=new JButton("Register");
ba.setBounds(100, 300, 130, 40);
lblBG1.add(ba);
ba.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String strunm,strupwd,strarole,strauid;
		strunm=txtnk.getText();
		strupwd=txtnsk.getText();
		strarole=txtnas.getText();
		strauid=txtns.getText();
		DBHandler objDB=new DBHandler();
		objDB.adminnow(strunm,strupwd,strarole,strauid);
		

		JOptionPane.showMessageDialog(null, "ID CREATED");
		dispose();
		
		AdminRegister frm =new AdminRegister();
	}
});


setTitle("CREATE ADMIN-ID");
setVisible(true);
setSize(Toolkit.getDefaultToolkit().getScreenSize());
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	




}
}

