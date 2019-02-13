package booyaka;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClsValidation {
	public static boolean isValidEmail(String strUnm)
	{
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		     
		      Boolean b = strUnm.matches(EMAIL_REGEX);
		      if(b==true)
		      {
		    	  return true;
		      }
		      else
		      {
		    	  return false;
		      }		      

	}
	public static boolean isValidMobNo(String str) 
	{
        Pattern mobNO = Pattern.compile("\\d{10}");
        Matcher matcher = mobNO.matcher(str);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }}


	public static boolean isNumber(String n)//10
	{
		System.out.println("hhhhhhhhhhhhhh");
		
		try {
			Integer.parseInt(n);
			return true;//this is integer
		} catch (NumberFormatException nfe) 
		{
			return false;//this is not integer
		}
	}
	public static boolean isTextEntered(String str)
	{
		if(str.equals("") || str.equals(null))//REQUIRED FIELD
		{		
			return false;
			//JOptionPane.showMessageDialog(null,"Please enter the unm","Error",JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			return true;
			//JOptionPane.showMessageDialog(null,"Welcome "+strUnm);
		}
	}
}
