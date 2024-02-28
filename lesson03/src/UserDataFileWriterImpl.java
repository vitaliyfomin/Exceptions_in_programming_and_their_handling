import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class UserDataFileWriterImpl implements UserDataFileWriter {
    @Override
    public void writeUserData(UserData userData) throws IOException {
        String fileName = userData.lastName() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String userDataString = String.join(" ",
                    userData.lastName(),
                    userData.firstName(),
                    userData.middleName(),
                    userData.dateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    String.valueOf(userData.phoneNumber()),
                    userData.gender().toString());

            writer.write(userDataString + "\n");
            System.out.println("Данные успешно записаны в файл: " + fileName);
        }
    }
}
