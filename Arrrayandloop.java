public class Arrrayandloop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number is " + max);
    }
    
}
