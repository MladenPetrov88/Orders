import java.util.Scanner;

public class Orders {

    public static void totalPriceCalculation (String product, double quantity, double totalPrice) {
        switch (product) {
            case "coffee":
                totalPrice = 1.50 * quantity;
                System.out.printf("%.2f", totalPrice);
                break;
            case "water":
                totalPrice = 1.00 * quantity;
                System.out.printf("%.2f", totalPrice);
                break;
            case "coke":
                totalPrice = 1.40 * quantity;
                System.out.printf("%.2f", totalPrice);
                break;
            case "snacks":
                totalPrice = 2.00 * quantity;
                System.out.printf("%.2f", totalPrice);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = scanner.nextDouble();
        double totalPrice = 0;

        totalPriceCalculation(product,quantity,totalPrice);
    }
}
