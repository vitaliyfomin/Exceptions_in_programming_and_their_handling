import java.time.LocalDate;

public class UserData {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final LocalDate dateOfBirth;
    private final long phoneNumber;
    private final char gender;

    public UserData(String lastName, String firstName, String middleName,
                    LocalDate dateOfBirth, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
}
