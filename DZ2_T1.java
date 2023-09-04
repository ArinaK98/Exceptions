import java.util.Scanner;

public class DZ2_T1 {
    public static void main(String[] args) {
        setNumber();
    }

    public static void setNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String numb = scanner.nextLine();
        try {
            float number = Float.parseFloat(numb);
            if ((number + 1) == 1){
                System.out.println("Вы ввели 0! введите дробное число. " );
                setNumber();
            }
            else {
                System.out.println("Вы ввели дробное число: " + number);
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели символ!");
            setNumber();
        }
        scanner.close();
    }
}

