public class Methods {
    public static void main(String[] args) {
        add(20,40);
        System.out.println("a is printed");
        natPrint(10);
    }

    public static void add(int a,int b){
//        int a = 10;
//        int b = 15;
        int c = a+b;
        System.out.println(c);
    }

    public  static  void natPrint(int n){
       //Base case
        if (n == 1){
            System.out.println(n);

            //Rescursive case
        }else {
            System.out.println(n);
            natPrint(n-1);
        }
    }
}