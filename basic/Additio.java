import java.util.Scanner;

public class Additio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();

        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();

        if (num1 > 0 && num2 > 100) {
            int sum = num1 + num2;
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("-1");
        }

        scan.close();
        
    }
}
