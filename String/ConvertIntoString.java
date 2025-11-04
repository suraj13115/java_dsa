import java.util.Scanner;
public class ConvertIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        String s = "" +n;
        System.out.println(s);
        System.out.println(s.length());


    }
}
