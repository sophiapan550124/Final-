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
        String answer = " ";
        answer(spam, times);
    }

    /**
     * produces the answer
     * @param spams user input for word they want to spam
     * @param time how many times they want the input to spam
     */
    public static void answer(String spams, int time) {
        int count = 0;
        MainMethod mySpam = new MainMethod(spams, time);
        while (count != time && spams.contains(" ") || count != time && !spams.contains(" ")) {
            mySpam.printSpam();
            count += 1;
        }
    }
}