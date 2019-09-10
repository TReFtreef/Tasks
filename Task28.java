package Training.Tasks;
import java.util.Arrays;
public class Task28 {
   static int max, min;

    public static void max_min(int num[]) {
        max = min = num[0];
        for (int i : num) {
            if (i > max)
            {
                max=i;
            }
            if(i<min)
            {
                min=i;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(num);
        System.out.println(" Original Array: "+Arrays.toString(num));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}
