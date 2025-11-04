public class equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String c = new String(s1);

        c = c+ "abc";
        System.out.println(s1==c);
        System.out.println(s1.equals(c));
    }
}
