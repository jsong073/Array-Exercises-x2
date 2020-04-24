import java.util.Scanner;

public class Challenge {
    public static void main (String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        String sentence = "";
        String[] words = new String[0];

        System.out.println("Enter a sentence.");
        sentence = input.nextLine();
        words = sentence.split(" ");
        System.out.println("You entered: " + sentence);

        for (int i = 0; i < words.length; i++) {
            System.out.println("\"" + words[i] + "\" has " + words[i].length() + " characters.");
        }
    }
}
