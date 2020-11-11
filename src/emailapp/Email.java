package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="syarikat.com";
	
	//constructor for name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
//		System.out.println("EMAIL FOR: "+ this.firstName+" "+this.lastName);

		
		//call and return department
		this.department=setDepartment();
//		System.out.println("Department: "+this.department);
		
		//method for random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Password: "+this.password);
		
		//combine
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//		System.out.println("Your email is: "+email);
		
	}
	
	
	
	//ask for department
	private String setDepartment() {
		System.out.print(firstName+", Enter the Department Code\n1 for Sales\n2 for Engineering\n3 for Accounts\n0 for none\nInput:");
		Scanner choice=new Scanner(System.in);
		int depChoice= choice.nextInt();
		if(depChoice==1) {
			return "sales";
		}
		else if(depChoice==2) {
			return "dev";
		}
		else if(depChoice==3) {
			return "acct";
		}
		else {
			return "general";
		}
	}
	
	//call random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password= new char[length];
		for(int i=0;i<length;i++) {
			int rand= (int)(Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);

		}
		return new String(password);
	}
	


	
	//mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	
	//alt email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	
	//change password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "NAME: "+firstName+" "+lastName+
				"\nCOMPANY EMAIL: "+email+
				"\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
				
	}
	
	

}
