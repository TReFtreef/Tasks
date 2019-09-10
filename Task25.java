package Training.Tasks;

import java.util.Arrays;

public class Task25 {
       public static void main(String[] args) {
        int[] num = {5, 1, 2, 8, 3};
                   //0  1  2  3  4
        int removeIndex = 1;
        for (int i=removeIndex; i<num.length-1; i++){
            num[i] = num[i+1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(num));
    }
}
