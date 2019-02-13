package booyaka;


import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Auditorium extends JFrame {
	Entry e=new Entry();
	static int temp;
	int i,seats=1;
	public Auditorium(){
	setLayout(null);
	
	DBHandler db=new DBHandler();
	boolean res=false;
	res=db.check();
	if(res==true){
		JOptionPane.showMessageDialog(null, "ALREADY BOOKED SEATS");
		
		
	}else{
		
		JButton arrBtn[]=new JButton[96];
		int xpos=30;
		int ypos=100;
	
		for(int i=0;i<96;i++){
		
			arrBtn[i]=new JButton(String .valueOf(i));
			arrBtn[i].setBounds(xpos,ypos,70,40);
			add(arrBtn[i]);
			xpos+=80;
			
			
			if(i==5||i==17||i==29||i==41||i==53||i==65||i==77||i==89){
				xpos+=80;
				
			}	
			if(i==23||i==59){
				ypos+=30;
			}
				if(i==11||i==23||i==35||i==47||i==59||i==71||i==83){
					ypos+=50;
					xpos=30;
					

			}
				
				arrBtn[i].addActionListener(new ActionListener()
				{
					
					
					public void actionPerformed(ActionEvent arg0) 
					{
					//	JButton btn=(JButton) arg0.getSource();
						
					//	btn.setBackground(Color.cyan);
					//	arrBtn[i].setEnabled(false);
		
						String str=arg0.getActionCommand();
						 
				      
			if(seats>0){			 
				       JButton source=(JButton) arg0.getSource();
				       e.button.add(Integer.parseInt(str)); 
				       source.setBackground(Color.RED);
				       temp=Integer.parseInt(str);
				       System.out.print(temp);
				       db.insertseats(temp);
				       
			seats--;			
			}
					}
				});
			
				
				
			}
		
		
		
		
		
	  JLabel jh=new JLabel("Available Seats");
	  jh.setBounds(50, 20, 300, 30);
	  Font gf=new Font("arial",Font.ITALIC,35);
		jh.setFont(gf);
		
		add(jh);
			

		JButton ba=new JButton("BOOK");
		ba.setBounds(800, 630, 150,40);
		add(ba);
		  ba.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					StudentID frm =new StudentID();
					
					dispose();
					
					
				}
	      	
	      });
		
		  
	  int array1[]=new int[e.button.size()];

                                           for (int i1=0;i1<e.button.size();i1++)

                                             {                        array1[i1]=e.button.get(i1);

	                                                                     // System.out.println(array1[i1]+" this");

                                                                     arrBtn[array1[i1]].setEnabled(false);

                                                                      // TODO Auto-generated method stub

	               

	                                             }
	
	}
	
	
	    
	  
	setTitle("AUDITORIUM");
	setVisible(true);
	setSize(Toolkit.getDefaultToolkit().getScreenSize());
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

}
}
 

