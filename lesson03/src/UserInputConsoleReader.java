import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInputConsoleReader implements UserInputReader {
    private final Scanner scanner;

    public UserInputConsoleReader(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public UserData readUserData() throws UserDataException {
        boolean validInput = false;
        UserData userData = null;

        while (!validInput) {
            System.out.println("Введите данные в следующем порядке, разделяя их пробелом: Фамилия Имя Отчество Дата рождения (dd.mm.yyyy) Номер телефона Пол (f или m)");

            try {
                String input = scanner.nextLine();
                String[] data = input.split(" ");

                if (data.length != 6) {
                    throw new UserDataException("Введено неверное количество данных");
                }

                LocalDate dateOfBirth = parseDateOfBirth(data[3]);
                long phoneNumber = parsePhoneNumber(data[4]);
                Gender gender = parseGender(data[5]);

                userData = new UserData(data[0], data[1], data[2], dateOfBirth, phoneNumber, gender);
                validInput = true;
            } catch (NumberFormatException e) {
                throw new UserDataException("Неверный формат номера телефона");
            } catch (ParseException e) {
                throw new UserDataException("Неверный формат даты рождения");
            }
        }

        return userData;
    }

    private LocalDate parseDateOfBirth(String dateOfBirthString) throws ParseException {
        try {
            return LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new ParseException("Неверный формат даты рождения", 0);
        }
    }

    private long parsePhoneNumber(String phoneNumberString) throws ParseException {
        try {
            return Long.parseLong(phoneNumberString);
        } catch (NumberFormatException e) {
            throw new ParseException("Неверный формат номера телефона", 0);
        }
    }

    private Gender parseGender(String genderString) throws ParseException {
        if (genderString.equalsIgnoreCase("m")) {
            return Gender.MALE;
        } else if (genderString.equalsIgnoreCase("f")) {
            return Gender.FEMALE;
        } else {
            throw new ParseException("Неверный формат пола", 0);
        }
    }
}
