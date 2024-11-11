import java.util.*;

public class ATM_complete_project {

    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;
        int addAmount = 0;
        int takeAmount = 0;

        String name;
        Scanner scanner = new Scanner(System.in);

        // we have to take input by users
        System.out.println("enter your pin number: ");

        int password = scanner.nextInt();
        scanner.nextLine();

        if (password == pin) {
            System.out.println("enter your name: ");
            name = scanner.nextLine();
            System.out.println("welcome " + name);

            while (true) {
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add your amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take recipt");
                System.out.println("press 5 to exit");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current account balance is: " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount you want to add: ");
                        addAmount = scanner.nextInt();
                        balance = addAmount + balance;
                        System.out.println("successfully credited");
                        break;
                    case 3:
                        System.out.println("How much you want to withdraw ");
                        takeAmount = scanner.nextInt();
                        if (takeAmount > balance) {
                            System.err.println("your balance is insufficient");
                            System.err.println("try less than your available balance");
                        } else {
                            System.err.println("success");
                            balance = balance - takeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("welcome to sampath bank ");
                        System.out.println("available amount is: " + balance);
                        System.out.println("available amount is: " + balance);
                        System.out.println("Amount desposited is: " + addAmount);
                        System.out.println("Amount taken is: " + takeAmount);
                        System.out.println("thank you");
                        break;
                }
                if (opt == 5) {
                    System.out.println("thank you");
                    break;
                }

            }
        } else {
            System.err.println("Wrong pin number");
        }

    }
}
