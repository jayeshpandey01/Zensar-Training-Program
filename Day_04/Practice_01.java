import java.util.Scanner;

public class Practice_01 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the product id: ");
            int id = sc.nextInt();
            System.out.println("Enter the product name: ");
            String name = sc.next();
            System.out.println("Enter the product price: ");
            double price = sc.nextDouble();
            products[i] = new Product(id, name, price);
        }
        for (int i = 0; i < n; i++) {
            products[i].display();
        }
    }
}
