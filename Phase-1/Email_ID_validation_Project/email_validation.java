package Email_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class email_validation {
	  public static void main(String[] args) {
	    
	        
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("viman.shaha@gmail.com");
	        emailID.add("arjun.yadav@gmail.com");
	        emailID.add("nain.abcd@gfhc.com");
	        emailID.add("anand.kharwar@gmail.com");
	        emailID.add("pradeep.ram@gmx.com");
	        emailID.add("shivam.singh@gmx.com");
	        emailID.add("anandkharwar2000@gmail.com");
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("You entered Email");
	        String searchEmail = sc.nextLine();
	        
	        if(emailID.contains(searchEmail)){
	           System.out.println( "email_ID " + searchEmail + " found");
	        }
	        
	        else{
	        	 System.out.println( "email_ID " + searchEmail + " not found");
	        }
	    
	    }
}
