import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word;

        while(true){
            System.out.print("Type any word: ");
            word = scanner.nextLine();

            if(!word.matches("^[a-z]+$")){
                System.out.println("invalid input!");
            }else
                break;
        }

        Scrabble scrabble = new Scrabble();
        int score = scrabble.calculateScore(word);

        System.out.println("Scrabble score: " + score);
        scanner.close();
    }
}
