import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.print("Type any word: ");
        word = scanner.nextLine();

        Scrabble scrabble = new Scrabble();
        int score = scrabble.calculateScore(word);

        System.out.println("Scrabble score: " + score);

        scanner.close();

    }
}
