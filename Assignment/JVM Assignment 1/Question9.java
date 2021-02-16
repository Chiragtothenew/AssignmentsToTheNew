class EnumExample4{  
    enum getPrice{   
    VILLA(5), BUNGALOW(10), FLAT(15), RENT(20);   
      
    private int price;  
    private getPrice(int value){  
    this.price=value;  
    }  
    }  
    public static void main(String args[]){  
    for (getPrice s : getPrice.values())  
    System.out.println(s+" "+s.price);  
      
    }}  