package Training.Tasks;

public class Task23 {
    public static boolean contains(int[] anum, int item) {
        for (int n : anum) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 18, 16, 23,
                145, 24, 25, 72, 5, 4, 65, 47, 6};
        System.out.println(contains(num, 23));
        System.out.println(contains(num, 15));
    }
}
