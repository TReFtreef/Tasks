package Training.Tasks;

import java.util.Scanner;

public class Task3 {
    private static boolean isPalindrome(String src) {
        src = src.replaceAll("[\\s]", "").toLowerCase();
        boolean result = true;
                for (int i = 0; i < src.length() / 2; i++) {
            if (src.charAt(i) != src.charAt(src.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Vvedite slovo ili chislo");
        System.out.println(isPalindrome(t.next()));
    }

}
