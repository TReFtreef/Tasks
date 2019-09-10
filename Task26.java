package Training.Tasks;

import java.util.Arrays;

public class Task26 {
    public static void main(String[] args) {
        int[] num = {1,3,5,6,8,2,4};
        int[] new_num = new int[num.length];
        for(int i = 0; i<num.length; i++){
            new_num[i]=num[i];}
            System.out.println("Old array and new array: " + Arrays.toString(num)+"  "+ Arrays.toString(new_num));

    }
}
