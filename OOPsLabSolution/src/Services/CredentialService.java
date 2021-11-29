package Services;

import java.util.Random;

import Model.Employee;

public class CredentialService {

	public char[] generatePassword() {
	String capletters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowletters="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String specialchar="@#$%&*";
	
	String combined=capletters+lowletters+numbers+specialchar;
	
	Random random=new Random();
	char[] password=new char[8];
	
	for(int i=0;i<password.length;i++)
	{password[i]=combined.charAt(random.nextInt(combined.length()));
}
	return password;
}

public String generateEmailAddress(String fName, String lName, String Dept) {
	String email;
	email=fName+lName+"@"+Dept+".abc.com";
return email;
}

public void showCredentials(Employee emp, String email, char[] password) {
	System.out.println("Dear "+ emp.getFirstName()+" Your generated Credentials are as follows:");
System.out.println("Email---> " + email);
System.out.println("Password---->"+ password);

}
}