package Training.Tasks;

public class Task21 {
    public static void main(String[] args){
        int [] num = {1,2,3,45,2,1,4,3,2};
        int sum=0;
        for (int v : num) sum += v;
        double average = sum/num.length;
        System.out.println(average);
    }
}
