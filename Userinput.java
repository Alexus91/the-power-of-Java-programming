import java.util.Scanner; // import the function Scanner for scan the input .
public class Userinput { // the class.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // use Scanner fun and creat scanner variable equal the new scanner 
        System.out.println("please enter your name"); // print the message requared 
        String name = scanner.nextLine(); // the input will be the name 
        System.out.println("your name is " + name); // print the the final msg and plus the  input given .
        
    }
    
}
