
class SingleLevel {
    // method to add two numbers
    void addSum(int n1 , int n2){
        System.out.println("sum :" + (n1+n2));
    }
}
class B extends  SingleLevel{} 
// class B extends SingleLevel
public class Main {
    // main method
    public static void main(String[] args) {
        // creating object of class B
        B objB = new B();
        // calling addSum method
        objB.addSum(10, 20);
        System.out.println();
    }

    
}
