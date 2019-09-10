package Training.Tasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        System.out.println("Vvedite chislo");
        Scanner n = new Scanner(System.in);
        System.out.println("Vvedite vtoroe chislo");
        Scanner m = new Scanner(System.in);
        int a = n.nextInt();
        int b = m.nextInt();
        if (a > b) {
            a += 3;
        } else {
            b += 8;
        }
        System.out.print("First number - " + a + ", second number - " + b);
    }
}
