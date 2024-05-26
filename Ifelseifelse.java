public class Ifelseifelse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b) {// the condition is false so it will not print the statement
            System.out.println("a is greater than b");
        } else if (b > c) { //  the condition is false so it will not print the statement
            System.out.println("b is greater than c");
        } else { // the condition is true so it will print the statement
            System.out.println("c is greater than a and b");
        }
    }
    
}
