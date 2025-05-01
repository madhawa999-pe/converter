import java.util.Scanner;

public class Displaydet {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\uD83C\uDF1F--------------Welcome to the Converter------------------\uD83C\uDF1F");
            System.out.println("1.\uD83D\uDCCF For length conversions");
            System.out.println("2.⚖\uFE0F For weight conversions");
            System.out.println("3. \uD83C\uDF21\uFE0F  For temperature conversions");
            System.out.println("4.\uD83D\uDEAA Exit");
            System.out.println(" \uD83D\uDD22  Choose your opinion ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    Lengthconverter.Convert(scanner);
                break;
                case 2:
                    Weightconverter.Convert(scanner);
                    break;
                case 3:
                    Tempconverter.Convert(scanner);
                    break;
                case 4:
                    System.out.println(" \uD83D\uDC4B exit ---GOOD BYE ---");
                    break;
                default:
                    System.out.println("Invalid operation try again ");
            }

        }
    }
}
