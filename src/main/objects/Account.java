package main.objects;

public class Account {
	
	/**
	* Create the constructor that takes the following:
	* First name
	* Last name
	* Email
	* Password
	**/
	
	private String firstName;
    private String lastName;
    private String email;
    private String password;
 
    public Account(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

	// Create the necessary Getter functions
    
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}	

}