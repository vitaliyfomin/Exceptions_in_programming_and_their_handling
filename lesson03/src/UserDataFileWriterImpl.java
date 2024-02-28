import java.io.FileWriter;
import java.io.IOException;

public class UserDataFileWriterImpl {
    public void writeUserDataToFile(UserData userData) throws IOException {
        String fileName = userData.getLastName() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String userDataString = userData.getLastName() + " " +
                    userData.getFirstName() + " " +
                    userData.getMiddleName() + " " +
                    userData.getDateOfBirth().toString() + " " +
                    userData.getPhoneNumber() + " " +
                    userData.getGender();
            writer.write(userDataString + "\n");
            System.out.println("Данные успешно записаны в файл: " + fileName);
        }
    }
}
