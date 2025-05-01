import java.util.Scanner;

class Weightconverter {
    public static void Convert(Scanner scanner){
        System.out.println(" ⚖\uFE0F Welcome to the Weight  converter ");
        System.out.println("➡\uFE0F 1.kilograms to pound ");
        System.out.println(" ⬅\uFE0F 2.pound  to kilograms ");
        System.out.println(" Now select");
        int option = scanner.nextInt();
        System.out.println(" \uD83D\uDD22  Enter your values ");
        double value = scanner.nextDouble();
        if(option == 1){
            System.out.println(value +" kilograms " +(value * 2.20462) +"pounds");
        }
        else if(option == 2){
            System.out.println(value +"pounds" +(value/2.20462) +"kilograms");
        }
        else {
            System.out.println("Wrong method");
        }
    }
}
