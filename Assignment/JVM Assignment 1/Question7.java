class Question7 {

    static String firstName = "Chirag";
    static String lastName = "Sharma";
    static int age = 21;

    static{

        System.out.println("THROUGH STATIC BLOCK"); //THROUGH STATIC BLOCK
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

    }

    public static void getDeatils()
    {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

}

class Run{
    public static void main(String[] args)
    {
        System.out.println("THROUGH STATIC METHODS");
        Question7.getDeatils(); // THROUGH STATIC METHODS

        System.out.println("THROUGH STATIC VARIABLES");
        Question7 Chirag = new Question7(); // THROUGH STATIC VARIABLES
        System.out.println(Chirag.firstName);
        System.out.println(Chirag.lastName);
        System.out.println(Chirag.age);

    }
}
