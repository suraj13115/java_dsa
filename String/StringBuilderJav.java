import java.util.Scanner;

public class StringBuilderJav{
public static void main(String[] args){
    // String s = "abc";
    // StringBuilder sb = new StringBuilder(s);
    // System.out.println(sb.length());
    // StringBuilder x = new StringBuilder(10);
    // System.out.println(x.capacity());

    //input form the user inputStringBuilder

   Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    System.out.println(sb);
    sb.setCharAt(1,'a');
    System.out.print(sb);
}
}