package Training.Tasks;

public class Task30 {
    public static void main(String[] args){
        int num[] = {1,23,4,5,3,4,1,2,7,6,8,7};
        for (int i=0; i<num.length-1;i++){
            for (int b=i+1; b<num.length;b++) {
                if (num[i] == num[b]) {
                    System.out.println("Duplicate elements: " + num[i]);
                }
            }
        }
    }

}
