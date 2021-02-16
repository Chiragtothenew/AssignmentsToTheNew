class Bank {


    public void getDetails(){
        System.out.println("WELCOME TO BANK SYSTEM");
    }
    
}

class SBI extends Bank {

    String bankname = "SBI BANK";
    int rate = 7;
    String branch = "Agra";

    public void getDetails()
    {
        System.out.println(bankname);
        System.out.println(rate);
        System.out.println(branch);
    }

}

class ICICI extends Bank {

    String bankname = "ICICI BANK";
    int rate = 5;
    String branch = "Faridabad";

    public void getDetails()
    {
        System.out.println(bankname);
        System.out.println(rate);
        System.out.println(branch);
    }

}

class BOI extends Bank {

    String bankname = "BOI BANK";
    int rate = 4;
    String branch = "Delhi";

    public void getDetails()
    {
        System.out.println(bankname);
        System.out.println(rate);
        System.out.println(branch);
    }

}

class Inheritance{
    public static void main(String[] args)
    {
        BOI boi = new BOI();
        boi.getDetails();

        SBI sbi = new SBI();
        sbi.getDetails();

        ICICI icici = new ICICI();
        icici.getDetails();

    }
}
