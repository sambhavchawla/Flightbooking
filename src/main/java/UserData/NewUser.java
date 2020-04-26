package UserData;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class NewUser {

  private String firstName;

  public String getFirstName() {
    return firstName;
  }

  public NewUser setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public NewUser setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public NewUser setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public NewUser setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getAddress1() {
    return address1;
  }

  public NewUser setAddress1(String address1) {
    this.address1 = address1;
    return this;
  }

  public String getAddress2() {
    return address2;
  }

  public NewUser setAddress2(String address2) {
    this.address2 = address2;
    return this;
  }

  public String getCity() {
    return city;
  }

  public NewUser setCity(String city) {
    this.city = city;
    return this;
  }

  public String getState() {
    return state;
  }

  public NewUser setState(String state) {
    this.state = state;
    return this;
  }

  public String getPincode() {
    return pincode;
  }

  public NewUser setPincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  public int getCountryIndex() {
    return countryIndex;
  }

  public NewUser setCountryIndex(int countryIndex) {
    this.countryIndex = countryIndex;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public NewUser setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public NewUser setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public NewUser setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
    return this;
  }

  private String lastName;

  private String phoneNumber;

  private String email;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private String pincode;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userName", firstName)
                .append("lastName", lastName)
                .append("phoneNumber", phoneNumber)
                .append("email", email)
                .append("address1", address1)
                .append("address2", address2)
                .append("city", city)
                .append("state", state)
                .append("pincode", pincode)
                .append("country", countryIndex)
                .append("username", username)
                .append("password", password)
                .append("confirmPassword", confirmPassword)
                .toString();
    }

  private int countryIndex;
  private String username;
  private String password;
  private String confirmPassword;
}
