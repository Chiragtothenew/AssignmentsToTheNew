class Calculate {

    Calculate(int i1, int i2)
    {
       System.out.println(i1+i2);
    }

    Calculate(double d1, double d2)
    {
        System.out.println(d1+d2);
    }

    Calculate(float f1, float f2)
    {
        System.out.println(f1*f2);
    }
    
    Calculate(String s1, String s2)
    {
        System.out.println(s1+s2);
    }

    Calculate(String s3, String s4, String s5)
    {
        System.out.println(s3+s4+s5);
    }

    public static void main(String[] args)
    {
        Calculate cal = new Calculate("Chirag ","Kumar ","Sharma");
        Calculate cal1 = new Calculate("Chirag ","Sharma");
        Calculate cal2 = new Calculate(1,2);
        Calculate cal3 = new Calculate(2.4,3.8);
        Calculate cal4 = new Calculate(111111111.45,1234567.2);


    }
}


