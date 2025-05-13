import javax.swing.*;
import java.awt.*;

private final JFrame frame = new JFrame("Scrabble game");
private HashMap<Character, Integer> map;
private int score;
public void main() {
    GUIStart();
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
//
//    System.out.println("----------------------- Welcome to the Scrabble Game -----------------");
//    System.out.print("Please Enter a word to calculate its score: ");
//    Scanner sc = new Scanner(System.in);
//    String word = sc.nextLine();
//    while (hasNonLetters(word)){
//        System.out.print("Please enter a word with only letters: ");
//        word = sc.nextLine();
//    }
//    word = word.toUpperCase();
//    scrabbleCalculate(word);
//    System.out.println("Your word score is: " + score);

}
public static boolean hasNonLetters(String s) {
    return !s.matches("[a-zA-Z ]+");
}


private void scrabbleCalculate(String word){
    word = word.toUpperCase();
    for (int i = 0; i < word.length(); i++){
        score +=(map.get(word.charAt(i)));
    }
}

private void GUIStart(){
    frame.setSize(420, 250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    JLabel titleLabel = new JLabel("Please enter a word to calculate its score:");
    JLabel resultLabel = new JLabel("");
    JTextField textField = new JTextField(16);
    JButton button = new JButton("Calculate");
    JPanel panel = new JPanel();
    panel.add(titleLabel);
    panel.add(textField);
    panel.add(button);
    panel.add(resultLabel);
    frame.add(panel);
    button.addActionListener(e -> {
        String word = textField.getText();
        if(hasNonLetters(word)){
            resultLabel.setText("Please enter a word with letters only");
            resultLabel.setForeground(Color.red);
        }
        else{
            scrabbleCalculate(word);
            resultLabel.setText("                 Your score is: " + score);
            resultLabel.setForeground(Color.blue);
            score = 0;
        }
    });


    centerFrame();
    frame.setVisible(true);
}

private void centerFrame() {
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    int w = frame.getWidth();
    int h = frame.getHeight();
    int x = (dim.width - w)/2;
    int y = (dim.height - h)/2;

    frame.setLocation(x, y);
}