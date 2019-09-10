package Training.Tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Vvedite minimal'noe chilo");
        Scanner b = new Scanner(System.in);
        System.out.println("Vvedite max chilo");
        int a = n.nextInt();
        int v = b.nextInt();
        for (; a<=v; a+=5){
            System.out.println(a);
        }

    }
}
