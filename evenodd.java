import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {

        System.out.print("Enter the number to chek Even or Odd : ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.err.println("Even Number ");

        } else {
            System.out.println("Odd number ");
        }
        sc.close();
    }

    String fist = "this is my first name ";
}
