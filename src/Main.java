import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1.kenar uzunluğunu giriniz: ");
        int a = input.nextInt();

        System.out.print("2.kenar uzunluğunu giriniz: ");
        int b = input.nextInt();

        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs uzunluğu: " + c);


    }
}