package booyaka;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WorkshopDetails extends JFrame {

	JPanel pnl;
	    JTable table;
	    Container c;
	    JLabel companyname;
	    JLabel subject;
	    JLabel dates;
	    JLabel duration;
	    JLabel ispaid;
	    JLabel studentlimit;
	    JLabel faculty;
	    JLabel amount;
	    JLabel companyid;
	    JLabel workshopid;
	public WorkshopDetails(){
		setLayout(null);

	   
	    
	

c=getContentPane();
c.setLayout(null);
c.setBackground(Color.white);
ImageIcon nw=new ImageIcon("bg.jpg");
JLabel lblBG1 = new JLabel(nw);
lblBG1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
add(lblBG1);

    
        pnl=new JPanel();
       // getContentPane();
       // setLayout(null);
        pnl.setBounds(10,200,800,450);
        pnl.setBackground(Color.red);
        lblBG1.add(pnl);
        pnl.setLayout(null);
       JLabel companyname=new JLabel ("companyname");
        companyname.setBounds(300,20,200,30);
        Font ab=new Font("arial",Font.ITALIC,20);
        companyname.setFont(ab);
        pnl.add(companyname);
        
        
        JLabel subject=new JLabel(" subject");
        subject.setBounds(300,60,100,20);
        Font cc=new Font("arial",Font.ITALIC,20);
        subject.setFont(cc);
        pnl.add( subject);
        

        JLabel dates=new JLabel("dates");
        dates.setBounds(300,100,100,20);
        Font cd=new Font("arial",Font.ITALIC,20);
        dates.setFont(cd);
        pnl.add(dates);

        JLabel duration=new JLabel("duration");
        duration.setBounds(300,140,100,20);
        Font ce=new Font("arial",Font.ITALIC,20);
        duration.setFont(ce);
        pnl.add(duration);
        
        JLabel ispaid=new JLabel("ispaid");
        ispaid.setBounds(300,180,100,20);
        Font cf=new Font("arial",Font.ITALIC,20);
        ispaid.setFont(cf);
        pnl.add(ispaid);
        
        JLabel studentlimit=new JLabel("studentlimit");
        studentlimit.setBounds(300,220,150,20);
        Font cg=new Font("arial",Font.ITALIC,20);
        studentlimit.setFont(cg);
        pnl.add(studentlimit);
        
        JLabel faculty=new JLabel("faculty");
        faculty.setBounds(300,260,100,20);
        Font ch=new Font("arial",Font.ITALIC,20);
        faculty.setFont(ch);
        pnl.add(faculty);
        
        JLabel amount=new JLabel("amount");
        amount.setBounds(300,300,100,20);
        Font ci=new Font("arial",Font.ITALIC,20);
        amount.setFont(ci);
        pnl.add(amount);
        
        

        JLabel companyid=new JLabel("companyid");
        companyid.setBounds(300,330,200,20);
        Font cj=new Font("arial",Font.ITALIC,20);
        companyid.setFont(cj);
        pnl.add(companyid);
        

        JLabel workshopid=new JLabel("workshopid");
        workshopid.setBounds(300,360,200,20);
        Font cw=new Font("arial",Font.ITALIC,20);
        workshopid.setFont(cw);
        pnl.add(workshopid);
        
        
        JLabel CompanyName=new JLabel ("companyname");
        CompanyName.setBounds(100,20,200,30);
        Font aB=new Font("arial",Font.ITALIC,20);
        CompanyName.setFont(aB);
        pnl.add(CompanyName);
        
        
        JLabel Subject=new JLabel(" subject");
        Subject.setBounds(100,60,100,20);
        Font cS=new Font("arial",Font.ITALIC,20);
        Subject.setFont(cS);
        pnl.add( Subject);
        

        JLabel Dates=new JLabel("dates");
        Dates.setBounds(100,100,100,20);
        Font cD=new Font("arial",Font.ITALIC,20);
        Dates.setFont(cD);
        pnl.add(Dates);

        JLabel Duration=new JLabel("duration");
        Duration.setBounds(100,140,100,20);
        Font cF=new Font("arial",Font.ITALIC,20);
        Duration.setFont(cF);
        pnl.add(Duration);
        
        JLabel IsPaid=new JLabel("ispaid");
        IsPaid.setBounds(100,180,100,20);
        Font cI=new Font("arial",Font.ITALIC,20);
        IsPaid.setFont(cI);
        pnl.add(IsPaid);
        
        JLabel StudentLimit=new JLabel("studentlimit");
        StudentLimit.setBounds(100,220,150,20);
        Font cG=new Font("arial",Font.ITALIC,20);
        StudentLimit.setFont(cG);
        pnl.add(StudentLimit);
        
        JLabel Faculty=new JLabel("faculty");
        Faculty.setBounds(100,260,100,20);
        Font cH=new Font("arial",Font.ITALIC,20);
        Faculty.setFont(cH);
        pnl.add(Faculty);
        
        JLabel Amount=new JLabel("amount");
        Amount.setBounds(100,300,100,20);
        Font cL=new Font("arial",Font.ITALIC,20);
        Amount.setFont(cL);
        pnl.add(Amount);
        
        

        JLabel CompanyId=new JLabel("companyid");
        CompanyId.setBounds(100,330,200,20);
        Font cJ=new Font("arial",Font.ITALIC,20);
        CompanyId.setFont(cJ);
        pnl.add(CompanyId);
        
        JLabel WorkshopId=new JLabel("workshopid");
        WorkshopId.setBounds(100,360,200,20);
        Font cW=new Font("arial",Font.ITALIC,20);
        WorkshopId.setFont(cW);
        pnl.add(WorkshopId);
        
       
        
        
        
        DBHandler objDH1=new DBHandler();
      
       table= objDH1.getDetails();
    		   
    		

      System.out.println("hey");
                
               table.addMouseListener(new MouseAdapter(){
                	
                	
					public void mouseClicked(MouseEvent evt){
                		System.out.println("Ninja");
                        
                        int row=table.rowAtPoint(evt.getPoint());
                        int column=table.columnAtPoint(evt.getPoint());
                        
                        String strcompanyname=String.valueOf(table.getValueAt(row, 0));
                        String strsubject=String.valueOf(table.getValueAt(row, 1));
                        String strdates=String.valueOf(table.getValueAt(row, 2));
                        String strduration=String.valueOf(table.getValueAt(row, 3));
                        String strispaid=String.valueOf(table.getValueAt(row, 4));
                        String strstudentlimit=String.valueOf(table.getValueAt(row, 5));
                        String strfaculty=String.valueOf(table.getValueAt(row, 6));
                        String stramount=String.valueOf(table.getValueAt(row, 7));
                        String strcompanyid=String.valueOf(table.getValueAt(row, 8));
                        String strworkshopid=String.valueOf(table.getValueAt(row, 9));
                        JOptionPane.showMessageDialog(null, row +" "+column+" "+"x= "+strcompanyname);
                        
                        System.out.println(row+" "+column);
                        companyname.setText(strcompanyname);
                        subject.setText(strsubject);
                        dates.setText(strdates);
                        duration.setText(strduration);
                        ispaid.setText(strispaid);
                        studentlimit.setText(strstudentlimit);
                        faculty.setText(strfaculty);
                        amount.setText(stramount);
                        companyid.setText(strcompanyid);
                        workshopid.setText(strworkshopid);
                        
                
                        
                    }
				});
                                    
            
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(10,50,1000,100);
        lblBG1.add(jsp);
        
        
        JButton btnlog=new JButton("Book Seat");
        btnlog.setBounds(840, 500, 100, 30);
        lblBG1.add(btnlog);
        
        btnlog.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Auditorium frm =new Auditorium();
				
				dispose();
				
				
			}
        	
        });

setTitle("WorkshopDetails");
setVisible(true);
setSize(Toolkit.getDefaultToolkit().getScreenSize());
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	

}
