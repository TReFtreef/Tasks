package Training.Tasks;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo sutok");
        int a = n.nextInt();
        a*=24;
        System.out.println(a);
        a*=60;
        System.out.println(a);
        a*=60;
        System.out.println(a);
    }
}
