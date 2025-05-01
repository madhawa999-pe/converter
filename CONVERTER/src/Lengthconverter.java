import java.util.Scanner;

class Lengthconverter{
    public static void Convert(Scanner scanner){
        System.out.println(" \uD83D\uDCCF Welcome to the length converter ");
        System.out.println("➡\uFE0F 1.Meters to feet");
        System.out.println("⬅\uFE0F 2.feet to meters ");
        System.out.println(" Now select");
        int option = scanner.nextInt();
        System.out.println(" \uD83D\uDD22Enter your values ");
        double value = scanner.nextDouble();
        if(option == 1){
            System.out.println(value +" meatres" +(value * 3.28084) +"Feets");
        }
        else if(option == 2){
            System.out.println(value +"Feets" +(value/3.28084) +"meters");
        }
        else {
            System.out.println("Wrong method");
        }
    }

}