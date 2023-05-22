package otus;

public class NumberToRubStringConverter extends NumberToStringConverter {
    @Override
    public String getCurrency(int sumToConvertToTxt) {
        int absoluteNumber = Math.abs(sumToConvertToTxt);
        int divRest = absoluteNumber % 100;

        if (divRest > 10 && divRest < 15) {
            return " рублей";
        } else {
            return switch (absoluteNumber % 10) {
                case 1 -> " рубль";
                case 2, 3, 4 -> " рубля";
                default -> " рублей";
            };
        }
    }
}
