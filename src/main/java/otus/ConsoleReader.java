package otus;

import java.util.Scanner;

public class ConsoleReader {
    private final Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Integer readNumber() {
        System.out.println("Введите сумму, конвертируемую в число (0 - выход):");

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при обработке числа: " + e);
            return null;
        }
    }
}
