package Training.Tasks;
import java.util.Arrays;

public class Task20 {
    public static void main(String[] args){
        int[] numbers = { 6, 3, 2, 5, 4 };
        Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.println(num);
        }
        String[] companies = { "Google", "Apple", "Sony" };
        Arrays.sort(companies);
        printNumbers(companies);
    }
    public static void printNumbers(String[] args){
        for (String num : args) {
            System.out.println(num);
        }
    } //Могу либо инт либо стринг сделать
}
