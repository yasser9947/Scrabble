import java.util.HashMap;
import java.util.Map;

public class ScrabbleCalc {
    private HashMap<Character, Integer> LetterScore = new HashMap<>();
    private int score;

    ScrabbleCalc(){
        addLetters(LetterScore, 1, "AEIOULNRST");
        addLetters(LetterScore, 2, "DG");
        addLetters(LetterScore, 3, "BCMP");
        addLetters(LetterScore, 4, "FHVWY");
        addLetters(LetterScore, 5, "K");
        addLetters(LetterScore, 8, "JX");
        addLetters(LetterScore, 10, "QZ");
    }

    private static void addLetters(Map<Character, Integer> map, int score, String letters) {
        for (char letter : letters.toCharArray()) {
            map.put(letter, score);
        }
    }

    public HashMap<Character, Integer> getLetterScore() {
        return LetterScore;
    }

    public int calculateScore(String word) {
        this.score = 0;
        for(char character: word.toUpperCase().toCharArray()){
            if (this.LetterScore.containsKey(character)){
                this.score += this.LetterScore.get(character);
            }

        }
        return this.score;
    }
}
