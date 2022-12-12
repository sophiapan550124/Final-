import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to spam?");
        String spam = input.nextLine();
        System.out.println("How many times would you like it to spam?");
        int times = input.nextInt();

        int count = 0;
        while (count != times) {
            System.out.print(spam + " ");
            count += 1;
        }
    }
}