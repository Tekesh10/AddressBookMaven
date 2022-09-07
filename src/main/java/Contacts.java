public class Contacts {
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String city;
    private String state;
    private String zipcode;

    public Contacts(String firstName, String lastName, String phone, String email, String city, String state, String zipcode) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.phone_number = phone;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirstname(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLastname(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "First Name : '" + first_name + "', Last Name : '" + last_name + "', Phone Number : '" + phone_number +
                "', email ID : '" + email + "', City : '" + city + "', State : '" + state + "', Zipcode : '" + zipcode + "'\n";
    }
}
