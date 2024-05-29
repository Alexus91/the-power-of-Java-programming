public class Strbasic {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s1); // true
        System.out.println(s2); // false
        System.out.println(s3); // false
        System.out.println(s4); // true
    }
    
}
