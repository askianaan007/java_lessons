public class examples {
    int apple_price =20;
    int apple_count = 5;

    void sum(){
      int multi =  apple_price * apple_count ;
      System.out.println(multi);
    }

    void sum2(int num1 , int num2){
      int total =  num1 + num2;
      System.out.println(total);
    }

    public static void main (String[] args){
        examples obj1 = new examples();
        obj1.sum();
        obj1.sum2(10,2);

    }
}

