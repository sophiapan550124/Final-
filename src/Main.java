/**
 * Final Project - Spam Generator
 * @author SPan
 */
import java.util.Scanner;
public class Main {
    /**
     * main method that takes user input and performs a task
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to spam?");
        String spam = input.nextLine();
        System.out.println("How many times would you like it to spam?");
        int times = input.nextInt();

        int count = 0;
        MainMethod mySpam = new MainMethod(spam, times);

        while (count != times) {
            mySpam.printSpam();
            count += 1;
        }
    }
}