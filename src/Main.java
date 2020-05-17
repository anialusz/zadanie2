import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        System.out.println("Press 1 to convert number from decimal to binary");
        System.out.println("Press 2 to convert number from binary to decimal");

        String userChoice = takeUserInput();

        if ("1".equals(userChoice)) {
            System.out.println("Please enter number to convert");
            String numberToConvert = takeUserInput();

            if (isCorrectDecimal(numberToConvert)) {
                System.out.print("Number " + numberToConvert + " in binary: ");
                System.out.print(conversion.convertFromDecimalToBinary(numberToConvert));
            }

        } else if ("2".equals(userChoice)) {
            System.out.println("Please enter number to convert");
            String numbertoConvert = takeUserInput();

            if (isCorrectBinary(numbertoConvert)) {
                System.out.print("Number " + numbertoConvert + " in decimal: ");
                System.out.print(conversion.convertFromBinaryToDecimal(numbertoConvert));
            }

        } else {
            System.out.println("Please provide correct number");
        }
    }


    private static String takeUserInput() {
        try {
            Scanner scan = new Scanner(System.in);
            return scan.next();
        } catch (Exception ex) {
            System.out.println("Please check provided data");
        }
        return "";
    }

    private static boolean isCorrectBinary(String numberToConvert) {
        if (numberToConvert.matches("^[01]+$")) {
            return true;
        }
        System.out.println("PLease provide proper number");
        return false;
    }

    private static boolean isCorrectDecimal(String numberToConvert) {
        if (numberToConvert.matches("[0-9]+")) {
            return true;
        }
        System.out.println("PLease provide proper number");
        return false;
    }
}