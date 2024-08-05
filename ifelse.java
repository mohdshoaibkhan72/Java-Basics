import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the Age : ");

        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("perfson is adults ");
        } else {
            System.out.println("person is under age ");
        }
        sc.close();
    }

}
