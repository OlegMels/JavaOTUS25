package otus;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader(new Scanner(System.in));
        NumberToStringConverter numberToStringConverter = new NumberToRubStringConverter();

        while (true) {
            Integer number = consoleReader.readNumber();
            if (number == 0) {
                exit(0);
            }

            String convertedNumToStr = numberToStringConverter.convertNumToStr(number);

            System.out.println(convertedNumToStr);
        }
    }
}
