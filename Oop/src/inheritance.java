class Animal{
    int noLegs =4 ;
    public static void  eat(){
        System.out.println("i can eat");
    } public static void  walk(){
        System.out.println("i can walk");
    }
}

class Dog extends Animal{ //inheritance
    int noLegs =5;
    Boolean Barking = true;
}

class Call{
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.noLegs);
        obj.eat();
        obj.walk();


        Dog obj1 = new Dog();
        System.out.println(obj1.noLegs);
        System.out.println(obj1.Barking);
        obj1.eat();
        obj1.walk();
    }
}



class Inheritance{
    public static void main(String[] args) {
    Son s = new Son();
        System.out.println(s.gender);
        s.print();
    }
}

class GrandFather {
    String gender = "M";
    void print(){
        System.out.println("parent class");
    }
}


class Father extends GrandFather{

}

class Son extends Father{

}