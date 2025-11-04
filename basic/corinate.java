
import java.util.Scanner;

public class corinate {
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        // Input coordinates
        System.out.print("Enter x-coordinate: ");
        double x = sc.nextDouble();

        System.out.print("Enter y-coordinate: ");
        double y = sc.nextDouble();

        // Check position
        if (x == 0 && y == 0) {
            System.out.println("The point is at the origin.");
        } else if (x == 0) {
            System.out.println("The point is on the y-axis.");
        } else if (y == 0) {
            System.out.println("The point is on the x-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point lies in the 1st Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in the 2nd Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in the 3rd Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in the 4th Quadrant.");
        }

        sc.close();
    }
}