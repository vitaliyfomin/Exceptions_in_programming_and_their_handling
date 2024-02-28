import java.time.LocalDate;

public record UserData(String lastName, String firstName, String middleName,
                       LocalDate dateOfBirth, long phoneNumber, Gender gender) {}
