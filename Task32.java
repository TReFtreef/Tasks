package Training.Tasks;

public class Task32 {
    public static void main(String[] args) {
        String[] words={"hi", "are","you","year","why","between"};
        String[] words2={"hello", "are","your","year","why_not","between"};
        for (int i=0; i<words.length;i++)
        {
            for(int b = 0; b<words2.length;b++)
            {
                if (words[i]==words2[b])
                {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
