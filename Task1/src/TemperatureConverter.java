import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisesta temperatuur Celsiuse järgi: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " kraadi Celsiuse järgi on " + fahrenheit + " kraadi Fahrenheiti järgi.");
        scanner.close();
    }
}
