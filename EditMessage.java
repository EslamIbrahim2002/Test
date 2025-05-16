package javacorse;

import java.util.Scanner;

public class EditMessage {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter The messge: ");
        String message = scan.nextLine();
        String word = "love";
        int index = 0;

        for (int i = 0; i < message.length(); i++) {
            if (index < word.length() && message.charAt(i) == word.charAt(index)) {
                index++;
            }
        }

        if (index == word.length()) {
            System.out.println("I love you, too!");
        } else {
            System.out.println("Let us breakup!");
        }
    }

}
