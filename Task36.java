package Training.Tasks;

import java.util.Arrays;

public class Task36 {
    public static void main(String[] args) {
        int[] my_array = {7, 5, 99, 15, 22,
                8, 2, 1, 47, 23,
                16, 25, 14, 99};
        System.out.println("Numeric array : "+ Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index =0; //my_array.length-1;
        while(index<my_array.length-(my_array.length-1)){
            index++;
        }
        System.out.println("Second smallest value: " + my_array[index]);
    }
}
