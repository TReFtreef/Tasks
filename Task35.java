package Training.Tasks;

import java.util.Arrays;

public class Task35 {
    public static void main(String[] args) {
        int[] my_array = {7, 5, 99, 15, 22,
                8, 2, 1, 47, 23,
                16, 25, 14, 99};
        System.out.println("Numeric array : "+ Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index = my_array.length-1;
        while(my_array[index]==my_array[my_array.length-1]){
            index--;
        }
        System.out.println("Second largest value: " + my_array[index]);
    }
}
