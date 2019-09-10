package Training.Tasks;

public class Task33 {
    public static void main(String[] args) {
        int num[] = {1, 33, 43, 55, 1, 4, 11, 2, 71, 6, 8,7};
        int num1[] = {1, 23, 44, 234, 4, 1, 2, 65, 62, 8, 7};
        for (int i = 0; i < num.length; i++) {
            for (int b = 0; b < num1.length; b++) {
                if (num[i] == num1[b]) {
                    System.out.println("Duplicate elements: " + (num[i]));
                }
            }
        }
    }
}

