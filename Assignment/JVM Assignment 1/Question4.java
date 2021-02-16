import javax.lang.model.util.ElementScanner14;

public class Question4 {

    public static void main(String[] args)
    {
        String s = "Chirag@@Abhishek#123";
        int length = s.length();

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for(int i=0;i<length;i++)
        {
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
            {
               lower++;
            }
            else if(Character.isUpperCase(c))
            {
                upper++;
            }
            else if(Character.isDigit(c))
            {
                digit++;
            }
            else{
                special++;
            }
 
        }

            double lp = (lower*100)/length;
            double up = (upper*100)/length;
            double dig = (digit*100)/length;
            double sp = (special*100)/length;

            System.out.println("Percentage of Lower Case Letter : " + lp);
            System.out.println("Percentage of Upper Case Letter : " + up);
            System.out.println("Percentage of Digits : " + dig);
            System.out.println("Percentage of Special Characters : " + sp);





    }
    
}
