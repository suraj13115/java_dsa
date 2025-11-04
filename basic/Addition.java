import java.util.Scanner;

public class Addition {
    
    void add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = scan.nextInt();
        System.out.println("enter the second 2");
        int num2  = scan.nextInt();

        if (num1 > 0 && num2>100){
            int sum = num1 + num2;
            System.out.println(sum);
        }
        else{
            System.out.println("-1");

        }
    }
}
class Launch {
    public static void main(String[] args) {
            Addition  a = new Addition();
            a.add(); 
    }
}
