import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInputConsoleReader inputReader = new UserInputConsoleReader(scanner);
        UserDataFileWriterImpl fileWriter = new UserDataFileWriterImpl();

        try {
            UserData userData = inputReader.readUserData();
            fileWriter.writeUserDataToFile(userData);
        } catch (UserDataException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
