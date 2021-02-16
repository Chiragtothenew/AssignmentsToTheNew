public class Question3 {
    public static void main(String[] args)
    {
        String s = "My name is Khan and i am not a terrorist";
        int lenght1 = s.length();

        String s2 = s.replace("i","");
        int length2 = s2.length();

        System.out.println(lenght1-length2);
    }
    
}
