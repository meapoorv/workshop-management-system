package booyaka;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.pool.OracleDataSource;

public class DBHandler {
	
	public boolean validuser(String strFirstname,String strLastname)
	{
		boolean res=false;
		Connection con = getDBCon();
		try{
		PreparedStatement stmt =con.prepareStatement("select * from createuid where Firstname=? and Lastname=?");
		stmt.setString(1, strFirstname);
		stmt.setString(2, strLastname);
	
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		{
			res = true;
		}
		else
		{
			res=false;
		}
			con.close();
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return res;
	}	
	
	public boolean isValidUser(String strFirstname,String strLastname,String strMobileno)
	{
		boolean res = false;
		Connection con = getDBCon();
		try{
		PreparedStatement stmt =con.prepareStatement("select * from createuid where firstname=? and lastname=? and mobileno=?");
		stmt.setString(1, strFirstname);
		stmt.setString(2, strLastname);
		stmt.setString(3, strMobileno);
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		{
			res = true;
		}
		else
		{
			res=false;
		}
			con.close();
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return res;
	}	
	
	public Connection getDBCon()
	{
		Connection con=null;
		OracleDataSource ods;
		try {
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			con=ods.getConnection("apoorv","icsd");
			System.out.println("conn established");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return con;
	
	}

	public void RegisterNow(String strFirstname, String strLastname, String strMobileno) {
		// TODO Auto-generated method stub
	try
	{
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("insert into createuid values(?,?,?)");
		stmt.setString(1, strFirstname);
		stmt.setString(2, strLastname);
		stmt.setString(3, strMobileno);
		stmt.executeUpdate();
		con.close();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	}

	public boolean admin(String unm, String upwd) {
		// TODO Auto-generated method stub
		
		boolean rest=false;
		Connection con = getDBCon();
		try{
		PreparedStatement stmt =con.prepareStatement("select * from tblAdmin where unm=? and upwd=?");
		stmt.setString(1, unm);
		stmt.setString(2, upwd);
	
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		{
			rest = true;
		}
		else
		{
			rest=false;
		}
			con.close();
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return rest;
	
	}
	

public JTable  getworkshop()
{
	String[] columnNames={"CompanyName","Subject","Dates","Duration","Is_Paid","Student_Limit","Faculty","Amount","CompanyId","Workshop_Id"};
	Connection con=getDBCon();
	try {
		PreparedStatement stmt=con.prepareStatement("select * from getworkshop ");
		ResultSet rset=stmt.executeQuery();
		DefaultTableModel model=new DefaultTableModel(columnNames,0);
		JTable jTable=new JTable(model);
			
		while(rset.next())
		{
			Vector row =new Vector();
			String columnname=rset.getString("CompanyName");
			String subject=rset.getString("Subject");
			String dates=rset.getString("Dates");
			String duration=rset.getString("Duration");
			String ispaid=rset.getString("Is_Paid");
			String studlimit=rset.getString("Student_Limit");

			String faculty =rset.getString("Faculty");
			String amount =rset.getString("Amount");
			String companyid=rset.getString("CompanyId");
			String workshopid=rset.getString("Workshop_Id");
			
			
			row.add(columnname);
			row.add(subject);
			row.add(dates);
			row.add(duration);
			row.add(ispaid);
			row.add(studlimit);
			row.add(faculty);
			row.add(amount);
			row.add(companyid);
			row.add(workshopid);
		model.addRow(row);
		}
return jTable;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
	
}

public void Facid(String strFirstName, String strPassword, String strMobileNo, String strEmailID) {
	// TODO Auto-generated method stub
	try
	{
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("insert into FacID values(?,?,?,?)");
		stmt.setString(1, strFirstName);
		stmt.setString(2, strPassword);
		stmt.setString(3, strMobileNo);
		stmt.setString(4, strEmailID);
		stmt.executeUpdate();
		con.close();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}

}
public boolean facid(String usr, String psw) {
	// TODO Auto-generated method stub
  boolean res=false;
  Connection con=getDBCon();
  try {
	PreparedStatement stmt=con.prepareStatement(" select * from Facid where FirstName=? and Password=?");
	stmt.setString(1, usr);
	stmt.setString(2, psw);
	ResultSet rset=stmt.executeQuery();
	if(rset.next()){
		res=true;
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
	return res;
}

public void stdid(String strRollNo,String strName, String strPassword, String strMobileNo, String strEmailID) {
	// TODO Auto-generated method stub
	try
	{
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("insert into stdid values(?,?,?,?,?)");
		stmt.setString(1, strRollNo);
		stmt.setString(2, strName);
		stmt.setString(3, strPassword);
		stmt.setString(4, strMobileNo);
		stmt.setString(5, strEmailID);
		stmt.executeUpdate();
		con.close();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}	
}

public boolean  check() {
	// TODO Auto-generated method stub

	Entry e=new Entry();
	boolean res=false;
	try
	{
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("select * from stdseats where name=?  ");
		
		
		
		stmt.setString(1, e.user);
		ResultSet rset1=stmt.executeQuery();
		if(rset1.next()){
			res=true;
		}
		
			con.close();
			} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	
	return res;
	
}


public void insertseats(int seats){
	Entry e=new Entry();
	Connection con=getDBCon();
	try {
		PreparedStatement stmt=con.prepareStatement("insert into stdseats values(?,?)");
		stmt.setInt(2, seats);
		stmt.setString(1, e.user);
	 stmt.executeQuery();
	con.close();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	
	
}


public boolean getlogin(String user, String psw) {
	// TODO Auto-generated method stub
  boolean res=false;
  Connection con=getDBCon();
  try {
	PreparedStatement stmt=con.prepareStatement(" select * from createuid where firstname=? and lastname=? ");
	stmt.setString(1, user);
	stmt.setString(2, psw);
	ResultSet rset=stmt.executeQuery();
	if(rset.next()){
		res=true;
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
	return res;
}

public void adminnow(String strunm, String strupwd, String strarole, String strauid) {
	// TODO Auto-generated method stub
	try
	{
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("insert into adminnow values(?,?,?,?)");
		stmt.setString(1, strunm);
		stmt.setString(2, strupwd);
		stmt.setString(3, strarole);
		stmt.setString(4, strauid);
		
		stmt.executeUpdate();
		con.close();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}	
}

public void getworkshop(String strCompanyName, String strSubject, String strDates, String strDuration,
		String strIs_Paid, String strStudent_Limit, String strFaculty, String strAmount,String strCompanyId,String strWorkshop_Id) {
	// TODO Auto-generated method stub
	
	
	try
	{
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("insert into getworkshop values(?,?,?,?,?,?,?,?,?,?)");
		stmt.setString(1, strCompanyName);
		stmt.setString(2, strSubject);
		stmt.setString(3, strDates);
		stmt.setString(4, strDuration);
		stmt.setString(5, strIs_Paid);
		stmt.setString(6, strStudent_Limit);
		stmt.setString(7, strFaculty);
		stmt.setString(8, strAmount);
		stmt.setString(9, strCompanyId);
		stmt.setString(10, strWorkshop_Id);
		stmt.executeUpdate();
		con.close();
		System.out.println("connection close");
	}
	catch(SQLException e)
	{
		System.out.println("connnn");
		e.printStackTrace();
	}	
	
}

public boolean getstudent(String usr, String pwd) {
	
	// TODO Auto-generated method stub
	
	Boolean res=false;
	Connection con=getDBCon();
	try {
		PreparedStatement stmt= con.prepareStatement("select * from stdid where Name=? and Password=?");
		stmt.setString(1, usr);
		stmt.setString(2,pwd);
		ResultSet rset=stmt.executeQuery();
		if(rset.next())
		{
			res = true;
		}
		else
		{
			res=false;
		}
			con.close();
			} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return res;
	
}

private ResultSet next() {
	// TODO Auto-generated method stub
	return null;
}


public void getDetails(String strcompanyname, String strsubject, String strdates, String strduration,
		String strispaid, String strstudentlimit, String strfaculty, String stramount,String strcompanyid,String strworkshopid) {
	// TODO Auto-generated method stub
	
	
	try
	{
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("insert into getDetails values(?,?,?,?,?,?,?,?,?,?)");
		stmt.setString(1, strcompanyname);
		stmt.setString(2, strsubject);
		stmt.setString(3, strdates);
		stmt.setString(4, strduration);
		stmt.setString(5, strispaid);
		stmt.setString(6, strstudentlimit);
		stmt.setString(7, strfaculty);
		stmt.setString(8, stramount);
		stmt.setString(9, strcompanyid);
		stmt.setString(10, strworkshopid);
		stmt.executeUpdate();
		con.close();
		System.out.println("connection close");
	}
	catch(SQLException e)
	{
		System.out.println("connnn");
		e.printStackTrace();
	}	
	
}

public JTable getDetails()
{
	String[] columnNames={"CompanyName","Subject","Dates","Duration","IsPaid","StudentLimit","Faculty","Amount","CompanyId","WorkshopId"};
	
	try {
		Connection con=getDBCon();
		PreparedStatement stmt=con.prepareStatement("select * from getDetails");
		ResultSet rset=stmt.executeQuery();
		
		DefaultTableModel model=new DefaultTableModel(columnNames,0);
		JTable JTable=new JTable(model);
			
		while(rset.next())
		{
			Vector row1 =new Vector();
			String strcompanyname=rset.getString("CompanyName");
			String strsubject=rset.getString("Subject");
			String strdates=rset.getString("Dates");
			String strduration=rset.getString("Duration");
			String strispaid=rset.getString("IsPaid");
			String strstudentlimit=rset.getString("StudentLimit");
			String strfaculty =rset.getString("Faculty");
			String stramount =rset.getString("Amount");
			String strcompanyid=rset.getString("CompanyId");
			String strworkshopid=rset.getString("WorkshopId");
			
		
			row1.add(strcompanyname);
			row1.add(strsubject);
			row1.add(strdates);
			row1.add(strduration);
			row1.add(strispaid);
			row1.add(strstudentlimit);
			row1.add(strfaculty);
			row1.add(stramount);
			row1.add(strcompanyid);
			row1.add(strworkshopid);
		model.addRow(row1);
		
		}
		return JTable;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
	
}

public void Truncate() {
	// TODO Auto-generated method stub
	Connection con=getDBCon();
	PreparedStatement stmt;
	try {
		stmt = con.prepareStatement("truncate table stdseats");
		stmt.executeQuery();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}




