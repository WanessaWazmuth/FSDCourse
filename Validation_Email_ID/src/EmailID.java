import java.util.*;

public class EmailID {
	  

    public static void main(String[] args) {

    	ArrayList<String> email = new ArrayList<String>();
    	
    	email.add("employee1@dell.com");
    	email.add("employee2@dell.com");
    	email.add("employee3@dell.com");
    	email.add("employee4@dell.com");
    	email.add("employee5@dell.com");
    	
    	System.out.println("Enter the email ID:");
    	Scanner scan=new Scanner(System.in);
    	String emailID=scan.nextLine();
    	
    	for(String comp: email){
    		
    		if(emailID.contains(comp)) {
    			
    			System.out.println(emailID+" exist in database.");
    			break;
    			
    			}else{
    				
    				System.out.println("Don't exist in database");
    				break;
    	
    			}
    	}
    	
    }
    
}