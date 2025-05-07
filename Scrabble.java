
public class Scrabble {
    public static int score(String word) {
        int total = 0;
        // نخلي الكلمة كلها حروف كابتل عشان نرتاح
        word = word.toUpperCase();
        // نمر على كل حرف ونحسب قيمته
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            // نحسب النقاط لكل الحروف
            if ("AEIOULNRST".indexOf(letter) != -1) {
                total += 1;
            } else if ("DG".indexOf(letter) != -1) {
                total += 2;
            } else if ("BCMP".indexOf(letter) != -1) {
                total += 3;
            } else if ("FHVWY".indexOf(letter) != -1) {
                total += 4;
            } else if (letter == 'K') {
                total += 5;
            } else if ("JX".indexOf(letter) != -1) {
                total += 8;
            } else if ("QZ".indexOf(letter) != -1) {
                total += 10;
            }
        }
        return total;
    }
    public static void main(String[] args) {

        String theWord = "cabbage";
        int result = Scrabble.score(theWord);
        System.out.println("Score for '" + theWord + "' is: " + result);
    }
}