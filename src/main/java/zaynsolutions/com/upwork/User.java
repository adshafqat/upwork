package zaynsolutions.com.upwork;

public class User {

  private final String userId;
	private final String firstName;
  private final String lastName;
  private final String address;

	public User(String userId, String firstName, String lastName, String address) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
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
}
