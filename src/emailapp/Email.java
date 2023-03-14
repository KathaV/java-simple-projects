package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private Scanner myScanner;
	
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		myScanner = new Scanner(System.in);
	}
	
	// Ask for the department
	public void whatDepartment() {
		System.out.println("What department?");
		department = myScanner.nextLine();
		System.out.println("Department: "+department+" accepted.");
	}
	
	
	
	// Generate a random password
	public String genRandPassword() {
		
		return "";
	}
	
	// Set the mailbox capacity
	public void setMbCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	// Set the alternate email
	
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	// Change the password
	
	public void changePassword(String newPassword) {
		password = newPassword;
	}
	
}