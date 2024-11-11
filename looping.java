import java.util.Scanner;

public class looping {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // int x = scan.nextInt();
        // int y = scan.nextInt();
        // System.out.println(x == y);

        // if (x > y) {
        // System.out.println("x higher");
        // } else {
        // System.out.println("y higher");

        // }

        String f1 = new String("apple");
        String f2 = new String("apple");

        String x1 = "orange";
        String x2 = "orange";

        System.out.println(f1 == f2);
        System.out.println(x1 == x2);
        // in here java obnly check references

        System.out.println(f1.equals(f2)); // this actually check to the content
        System.out.println(f1 == f2);

        String RCB = "loose";
        if (RCB.equals("win")) {
            System.out.println("ee sala cup namadhey");
        } else {
            System.out.println("no cup");

        }
    }
}
