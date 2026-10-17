import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your username: ");
	System.out.print("Welcome friend !!");
        String username = scanner.nextLine();
        
        System.out.println("Hey there, Friend!");
        
        scanner.close();
    }
}
