package Training.Tasks;

public class Task17 {
    public static void main(String[] args){
        double[][] numbers ={
                {1, 1, 1},
                {1, 2, 1},
                {1, 2, 2}
        }; double max = 0;
        for (double[] number : numbers) {
            for (double i : number) {
                if ( max < i) {max = i;}
            }
        }
        for (double[] number : numbers) {
            for (double k : number) {
                k/=max;
                System.out.println(k);
            }
        }
    }
}
