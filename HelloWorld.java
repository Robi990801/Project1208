import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=== Szuper Számológép v2.0  ===");
        
        while (running) {
            System.out.println("\nVálassz műveletet:");
            System.out.println("1. Összeadás");
            System.out.println("2. Kivonás");
            System.out.println("3. Szorzás");
            System.out.println("4. Osztás");
            System.out.println("5. Kilépés");
            System.out.print("Választás: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Viszlát!");
                running = false;
                continue;
            }
            
            System.out.print("Add meg az első számot: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Add meg a második számot: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Eredmény: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Eredmény: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Eredmény: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Eredmény: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Hiba: Nullával nem lehet osztani!");
                    }
                    break;
                default:
                    System.out.println("Érvénytelen választás!");
            }
        }
        
        scanner.close();
    }
}
