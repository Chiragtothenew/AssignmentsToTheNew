public class Question2 {
    public static void main(String[] args)
    {
        String s = "he is Chirag and Chirag is learning to code and he is training at TOTHENEW";

        String s1[] = s.split(" ");

        System.out.println(s1.length);

        for(int i=0;i<s1.length;i++)
        {
            int count = 1;

            for(int j=i+1;j<s1.length;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    count++;
                    s1[j]="ignore";
                }
            }

            if(count>1 && s1[i]!="ignore")
            {
                System.out.println(s1[i] + " Occurences : " + count);
            }
        }
    }

}
