import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        System.out.println("Hello, " + username + "! Welcome to the repository.");
        
        scanner.close();
    }
}
