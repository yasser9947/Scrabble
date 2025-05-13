
import java.util.*;



public class Scrabble {




    public void calculation(String word) {
        Map<Character, Integer> map = new HashMap<>();

        String letters = "qzjxkfhvwybcmpdgaeioulnrst";

        for (int i = 0; i < letters.length(); i++) {

            if (i <= 1)

                map.put(letters.charAt(i), 10);

            else if (i <= 3)

                map.put(letters.charAt(i), 8);

            else if (i <= 4)

                map.put(letters.charAt(i), 5);

            else if (i <= 9)

                map.put(letters.charAt(i), 4);

            else if (i <= 13)

                map.put(letters.charAt(i), 3);

            else if (i <= 15)

                map.put(letters.charAt(i), 2);

            else

                map.put(letters.charAt(i), 1);

        }

        Integer score = 0;

        for (int i = 0; i < word.length(); i++) {

            score += map.get(word.charAt(i));

        }

        System.out.println("Score is: " + score);


    }



}


