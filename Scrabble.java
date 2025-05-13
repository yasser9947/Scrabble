import java.util.HashMap;

public class Scrabble {

    HashMap<Character, Integer> scrabble = new HashMap<>();

    public Scrabble(){
        addLetters("AEIOULNRST", 1);
        addLetters("DG", 2);
        addLetters("BCMP", 3);
        addLetters("FHVWY", 4);
        addLetters("K", 5);
        addLetters("JX", 8);
        addLetters("QZ", 10);
    }

    private void addLetters(String letters, int value){
        for (char c : letters.toCharArray()){
            scrabble.put(c, value);
        }
    }

    public int calculateScore(String word){
        int total = 0;
        for (char c : word.toUpperCase().toCharArray()){
            if(scrabble.containsKey(c))
                total += scrabble.get(c);
        }
        return total;
    }
}
