package Driver;

import java.util.Scanner;

import Model.Employee;
import Services.CredentialService;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		CredentialService cs=new CredentialService();
		Employee emp=new Employee("Harshit", "Choudhary");
		String Email;
		char[] Password;
		
System.out.println(" Please enter the Department from the following");
System.out.println("1. Technical");
System.out.println("2. Admin");
System.out.println("3. Human Resource");
System.out.println("4. Legal");
	
int choice= input.nextInt();
if(choice==1) {
Email= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech");
Password= cs.generatePassword();
cs.showCredentials(emp, Email, Password);
}
else if(choice==2) {
Email= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "admin");
Password= cs.generatePassword();
cs.showCredentials(emp, Email, Password);
}
else if(choice==3) {
Email= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "hr");
Password= cs.generatePassword();
cs.showCredentials(emp, Email, Password);
}
else if(choice==4) {
Email= cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
Password= cs.generatePassword();
cs.showCredentials(emp, Email, Password);
}
else {
	System.out.println("Invalid Input");
}
input.close();
	}

}
