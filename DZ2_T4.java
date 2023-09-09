import java.util.Scanner;

public class DZ2_T4 {
    public static void main(String[] args) {
        emptyString(new IllegalArgumentException("Вы ввели пустую строку!"));
    }

    private static void emptyString(IllegalArgumentException illegalArgumentException) {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        if (string.isEmpty()) {
            throw illegalArgumentException;
        }
        else{
            System.out.println("Вы ввели: " + string);
        }
        
    }
}
