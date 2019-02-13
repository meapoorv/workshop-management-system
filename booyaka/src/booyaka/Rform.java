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
import javax.swing.JTextField;

public class Rform extends JFrame {
	
	public Rform()
	{
		setLayout(null);

		ImageIcon nw=new ImageIcon("bg.jpg");
		JLabel lblBG1 = new JLabel(nw);
		lblBG1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		add(lblBG1);
	
		

JLabel Lblusid = new JLabel("User-ID");
Lblusid.setBounds(10,30,300,30);
Lblusid.setForeground(Color.WHITE);
Font ab=new Font("arial",Font.BOLD,25);
Lblusid.setFont(ab);
lblBG1.add(Lblusid);

JTextField txtna = new JTextField();
txtna.setBounds(220,30,150,25);
add(txtna);

JLabel Lblpsd = new JLabel("Password");
Lblpsd.setBounds(10,70,300,30);
Lblpsd.setForeground(Color.WHITE);
Font acb=new Font("arial",Font.BOLD,25);
Lblpsd.setFont(acb);
lblBG1.add(Lblpsd);

JTextField txtan = new JTextField();
txtan.setBounds(220,70,150,25);
add(txtan);

JButton btnlogn=new JButton("LOGIN");
btnlogn.setBounds(70, 100, 100, 30);
lblBG1.add(btnlogn);
btnlogn.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String unm=txtna.getText();		
		String upwd=txtan.getText();
		DBHandler obj=new DBHandler();
		boolean rest;
		
		rest=obj.admin(unm,upwd);

		if(rest==true)
		{
			dispose();
			Loginframe frm =new Loginframe();
			
		
		}
	//	Loginframe frm =new Loginframe();
		//dispose();
	}
	
});


JButton bnc=new JButton("Create-NewID");
bnc.setBounds(100, 150, 130, 40);
lblBG1.add(bnc);
bnc.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		Admin frm =new Admin();
		//CreateID frm =new CreateID();
		dispose();
	}
	
});

setTitle("Rform");
setVisible(true);
setSize(Toolkit.getDefaultToolkit().getScreenSize());
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
	}

}

