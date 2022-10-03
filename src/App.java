import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        double Fahrenheit, graus;

        System.out.println("Inira a temperatura em graus Fahrenheit ");
        Fahrenheit = console.nextDouble();
        graus = 5 * ((Fahrenheit - 32) / 9);
        System.out.println(Fahrenheit + " em Fahrenheit " + graus + " em graus Celsius ");
        console.close();

    }
}
