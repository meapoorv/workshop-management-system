package booyaka;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ApprovedStatus extends JFrame {
	JTable table;
	public ApprovedStatus(){
		setLayout(null);
		

		ImageIcon nw=new ImageIcon("bg.jpg");
		JLabel lblBG1 = new JLabel(nw);
		lblBG1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		add(lblBG1);
	
		
		DBHandler objDH1=new DBHandler();
		table=objDH1.getDetails();
		
	       
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(10,50,1200,300);
       lblBG1. add(jsp);
        
		
        JButton btnc1=new JButton("Back");
        btnc1.setBounds(700, 550, 130, 40);
       lblBG1. add(btnc1);	

        btnc1.addActionListener(new ActionListener(){

        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        		// TODO Auto-generated method stub
        		Admin frm=new Admin();
        		dispose();
        	}
        	
        });
		
		
		
		setTitle("Approved Status");
		setVisible(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
