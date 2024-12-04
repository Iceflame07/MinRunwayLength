package Thing.Akkount;

public class Account {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private String pinCode;

    public Account(String chibuike, String Elisha, int i) {
        this.firstName = chibuike;
        this.lastName = Elisha;
        this.accountNumber = Integer.toString(i);
        this.pinCode = Integer.toString(i);
    };

    public String getFirstName() {
        return firstName;
    };

    public String getLastName() {
        return lastName;
    };

    public String getAccountNumber() {
        return accountNumber;
    };

    public String getPinCode() {
        return pinCode;
    };
}
