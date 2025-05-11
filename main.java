private String word;
private HashMap<Character, Integer> map;
private int score;
public void main() {
    map = new HashMap<>();
    for (char c : new char[]{'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'}) {
        map.put(c, 1);
    }
    map.put('D', 2);
    map.put('G', 2);
    for (char c : new char[]{'B', 'C', 'M', 'P'}) {
        map.put(c, 3);
    }
    for (char c : new char[]{'F', 'H', 'V', 'W', 'Y'}) {
        map.put(c, 4);
    }
    map.put('K', 5);
    map.put('J', 8);
    map.put('X', 8);
    map.put('Q', 10);
    map.put('Z', 10);
    map.put(' ', 0);

    System.out.println("----------------------- Welcome to the Scrabble Game -----------------");
    System.out.print("Please Enter a word to calculate its score: ");
    Scanner sc = new Scanner(System.in);
    word = sc.nextLine();
    while (hasNonLetters(word)){
        System.out.print("Please enter a word with only letters: ");
        word = sc.nextLine();
    }
    word = word.toUpperCase();
    scrabbleCalculate(word);
    System.out.println("Your word score is: " + score);

}
public static boolean hasNonLetters(String s) {
    return !s.matches("[a-zA-Z ]+");
}


private void scrabbleCalculate(String word){

    for (int i = 0; i < word.length(); i++){
        score +=(map.get(word.charAt(i)));
    }
}