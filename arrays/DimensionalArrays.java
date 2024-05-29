package arrays;
/* dimensional arrays  */
public class DimensionalArrays {
    // The above code can be written in a more efficient way using arrays and loops.
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {10,20,30},
            {70,80,90},
        };
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}