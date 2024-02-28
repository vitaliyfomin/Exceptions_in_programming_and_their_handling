import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInputConsoleReader {
    private final Scanner scanner;

    public UserInputConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public UserData readUserData() throws UserDataException {
        System.out.println("Введите данные: Фамилия Имя Отчество Дата рождения (dd.mm.yyyy) Номер телефона Пол (f/m)");
        String input = scanner.nextLine();
        String[] data = input.split(" ");

        if (data.length != 6) {
            throw new UserDataException("Неверное количество данных");
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        LocalDate dateOfBirth;
        try {
            dateOfBirth = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            throw new UserDataException("Неверный формат даты рождения");
        }

        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            throw new UserDataException("Неверный формат номера телефона");
        }

        char gender = data[5].charAt(0);
        if (gender != 'f' && gender != 'm') {
            throw new UserDataException("Неверный формат пола");
        }

        return new UserData(lastName, firstName, middleName, dateOfBirth, phoneNumber, gender);
    }
}
