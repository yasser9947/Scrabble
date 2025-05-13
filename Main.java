import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Scrabble scrabble = new Scrabble();
        String word;

      do {
          System.out.println("Enter a word ");
            word = scan.nextLine();

          if (word.toLowerCase().trim().matches("^[a-z]+$"))
          {
                scrabble.calculation(word);
            }
            else if (!word.equals("?"))
                System.out.println("Enter a valid value \nenter ? to exit ");


      }while (!word.equals("?"));

    }
}
