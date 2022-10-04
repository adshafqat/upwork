package zaynsolutions.com.upwork;

public class User {

  private final String userId;
  private final String firstName;
  private final String lastName;
  private final String address;
  private final String message;

	public User(String userId, String firstName, String lastName, String address, String message) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.message = message;
	}

	public String getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}
	
	public String getMessage() {
		return message;
	}
}
