package Training.Tasks;

public class Task24 {
    public static int contains(int[] num, int item) {
        for (int i=0; i<num.length; i++) {
            if (num[i] == item)
                return i;
        }
        return num.length;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 18, 16, 23,
                145, 24, 25, 72, 5, 4, 65, 47, 6};
        System.out.println("Index position is: " + contains(num, 23));
        System.out.println("Index position is: " + contains(num, 47));
    }

}
