import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = sc.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída
        System.out.printf("Temperatura em Fahrenheit (°F): %.2f%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin (K): %.2f%n", kelvin);

        sc.close();
    }
}
