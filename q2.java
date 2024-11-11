import java.util.Scanner;

class q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String Name = scan.nextLine();
        // int Age = scan.nextInt();
        // scan.nextLine(); // it use when use scanner after int for string
        // String Address = scan.nextLine();
        // System.out.println("My name is : " + Name);
        // System.out.println("My age is : " + Age);
        // System.out.println("My address is : " + Address);

        // question 3
        // int input1 = scan.nextInt();
        // int input2 = scan.nextInt();
        // int input3 = scan.nextInt();
        // int d = input1 * input2 * input3;
        // int e = input1 + input2 + input3;
        // System.out.println(d / e);

        // question 4
        String Name = scan.nextLine();
        double Score = scan.nextDouble();
        scan.nextLine();
        String department = scan.nextLine();
        System.out.println("my name is " + Name);
        System.out.println("my score is " + Score / 10);
        System.out.println(department.charAt(2));
        System.out.println("demy department is" + department);
    }
}