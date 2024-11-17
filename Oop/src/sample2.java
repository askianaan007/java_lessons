class Sample{
 int rolno;
 int marks;

 Sample(int num,int mark){
     System.out.println("this is default constructor");
     rolno =num;
     marks =mark;
 }
}

class Construct{
    public static void main(String[] args) {
        Sample obj = new Sample(71,40);
        System.out.println(obj.marks);
        System.out.println(obj.rolno);
    }
}


