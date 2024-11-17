public class Polymorphism {
    public static void main(String[] args) {
        Method obj1 = new Method();
        obj1.display();
        obj1.display(5);
    }
}


class Method{
    void display(){
        System.out.println("im a void function");
    }

    void  display(int a){
        System.out.println(a);
    }
}


