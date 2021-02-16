
 class Question8 {

    public static void main(String[] args)
    {
        String sent = "Yes OR No OR Yes";
        StringBuffer revsent = new StringBuffer(sent).reverse().delete(4,10);
        System.out.println(revsent);
    }

    
    
}
