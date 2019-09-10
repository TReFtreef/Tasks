package Training.Tasks;

import java.util.Arrays;

public class Task29 {
    public static int[] revers (int[] num) {
        int[] t = new int[num.length];
        for (int i=t.length-1, b=0; i>=0; i--, b++)
        {
            t[b]=num[i];
        }
        return t;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        System.out.println(" Original Array: "+ Arrays.toString(num));
        num=revers(num);
        System.out.println("New Array: "+ Arrays.toString(num));
    }
}
