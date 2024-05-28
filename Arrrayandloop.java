public class Arrrayandloop {
    // The above code can be written in a more efficient way using arrays and loops.
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) { // if the current element is greater than the max
                max = numbers[i];// then assign the current element to max
            }
        }
        System.out.println("The largest number is " + max);
    }
    
}
