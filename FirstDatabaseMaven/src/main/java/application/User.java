package application;

/**
 * The User class represents a user entity in the system.
 * It contains the user's details such as email, password, and role.
 */
public class User {
    private String email;
    private String password;
    private String role;

    // Constructor to initialize a new User object with email, password, and role.
    public User( String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
    
    // Sets the role of the user.
    public void setRole(String role) {
    	this.role=role;
    }

    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
}
