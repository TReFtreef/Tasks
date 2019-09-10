package Training.Tasks;

import java.util.Arrays;

public class Task27 {
    public static void main(String[] args) {
        int[] num = {1,4,77,32,7,4};
        int[] new_num = new int[num.length+1];
        int position=3, value = 72;
        for(int is = 0, ib =0; is<num.length && ib<new_num.length;is++,ib++) {

            if (position == is && position == ib) {
                new_num[position] = value;
                is--;
            } else {
                new_num[ib] = num[is];
            }

        }
        System.out.println("New array" + Arrays.toString(new_num));
    }
}
