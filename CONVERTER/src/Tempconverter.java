import java.util.Scanner;

class Tempconverter {
    public static void Convert(Scanner scanner){
        System.out.println(" \uD83C\uDF21\uFE0F Welcome to the temperature converter ");
        System.out.println(" \uD83D\uDD25 1.celsius  to fahrenheit ");
        System.out.println("❄\uFE0F 2.fahrenheit to celsius ");
        System.out.println("Now select");
        int option = scanner.nextInt();
        System.out.println(" \uD83D\uDD22  Enter your values ");
        double value = scanner.nextDouble();
        if(option == 1){
            System.out.println(value +"celsius " +((value * 9/5) +32) +"fahrenheit");
        }
        else if(option == 2){
            System.out.println(value +"fahrenheit" +((value -32 ) *5/9)+"celsius");
        }
        else {
            System.out.println("Wrong method");
        }
    }
}
