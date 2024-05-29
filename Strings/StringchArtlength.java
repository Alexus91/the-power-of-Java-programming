public class StringchArtlength {
    public static void main(String[] args) {
        String s1 = "my name is kamal fadl";
        String s2 = "name";
        String s3 = new String("is");
        System.out.println(s1.charAt(0)); // m
        System.out.println(s1.length()); // 2
        System.out.println(s1.equals(s2)); // fasle
        for(int i = 0 ;i < s1.length(); i++){
            System.out.println(s1.charAt(i));
        }
    }
}
