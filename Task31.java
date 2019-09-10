package Training.Tasks;

public class Task31 {
    public static void main(String[] args)
    {
        String[] words = {"bvb", "rfr", "hi", "are", "hi", "bvb", "yes", "wqw"};

        for (int i = 0; i < words.length-1; i++)
        {
            for (int b = i+1; b < words.length; b++)
            {
                if ((words[i] == words[b]) && (i != b))
                {
                    System.out.println("Duplicate Element : "+words[b]);
                }
            }
        }
    }
}
