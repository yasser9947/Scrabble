import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScrabbleCalc scrabbleCalc = new ScrabbleCalc();

        // Take user input

        try {
            // Take user input
            System.out.print("Please enter a word to calculate: ");
            String word = scanner.nextLine().trim();

            // Validate word if it's empty or not a letter
            if (word.isEmpty()){
                throw new RuntimeException("No word was provided!");
            } else if (!word.matches("[a-zA-Z]+")){
                throw new RuntimeException("The 'word' should be from A-Z or a-z only!");
            }

            int wordScore =  scrabbleCalc.calculateScore(word);

            System.out.println("The score of the word '"
                    + word
                    + "' is: "
                    + wordScore);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }




    }
}
