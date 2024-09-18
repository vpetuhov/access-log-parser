import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int numberOne = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = new Scanner(System.in).nextInt();

        System.out.println("Сумма: " + (numberOne + numberTwo));
        System.out.println("Разность: " + (numberOne - numberTwo));
        System.out.println("Произведение: " + (numberOne * numberTwo));
        System.out.println("Частное: " + String.format("%.1f", (double) numberOne / numberTwo));
    }
}