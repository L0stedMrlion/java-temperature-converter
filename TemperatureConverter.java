import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌡️  Temperature Converter  🌡️");
        System.out.println("1️⃣  Celsius to Fahrenheit ");
        System.out.println("2️⃣  Fahrenheit to Celsius ");
        System.out.print("⚙️  Enter your choice (1️⃣ or  2️⃣ ): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("➡️  Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println("➡️  Temperature in Fahrenheit: " + fahrenheit + "°F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusResult = fahrenheitToCelsius(fahrenheitInput);
                System.out.println("➡️  Temperature in Celsius: " + celsiusResult + "°C");
                break;

            default:
                System.out.println("❌  Invalid choice. Please enter 1 or 2. ❌");
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
