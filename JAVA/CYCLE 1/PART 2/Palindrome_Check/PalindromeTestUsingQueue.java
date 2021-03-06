import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class PalindromeTestUsingQueue {

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        Scanner sc=new Scanner(System.in);
        String inputString = sc.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String is not a palindrome.");

    }
}