public class Stringindexandreplace {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s1.replace('l', 'w')); // Hewwo
        System.out.println(s1.indexOf('l')); // 2
        System.out.println(s1.indexOf('l', 3)); // 3
        System.out.println(s1.indexOf("lo")); // 3
        System.out.println(s1.indexOf("lo", 4)); // -1
        System.out.println(s1.lastIndexOf('l')); // 3
        System.out.println(s1.lastIndexOf('l', 3)); // 3
        System.out.println(s1.lastIndexOf("lo")); // 3
        System.out.println(s1.lastIndexOf("lo", 4)); // 3        
    }
    
}