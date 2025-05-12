# Scrabble

Write a program that will replicate the scoring system in Scrabble. The function should take a single argument (the word, comprised of letters/tiles) and return a score. 

## Letter Values

You'll need these:

```plain
Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
```

So now that you've got those letter values, consider what data structure is good for mapping keys to values?

## Examples
"cabbage" should be scored as worth 14 points:

- 3 points for C
- 1 point for A, twice
- 3 points for B, twice
- 2 points for G
- 1 point for E

And to total:

- `3 + 2 * 1 + 2 * 3 + 2 + 1`
- = `3 + 2 + 6 + 3`
- = `5 + 9`
- = 14

## Double Check
http://www.dvorkin.com/scrabscor.php





## Solution:


```public class Scrabble{
    public static  int calculatescore(String word){

        int totalscore=0;

        word=word.toUpperCase();

        for (char letter : word.toCharArray()){
            totalscore += LetterScore(letter);
        }
        return totalscore;
    }

    public static int LetterScore(char letter){

        if( letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U' || letter=='L' || letter=='N' || letter=='R' || letter=='S' || letter=='T')
            return 1;
        else if (letter=='D' || letter=='G')
            return 2;
        else if(letter=='B' || letter=='C' || letter=='M' || letter=='P')
            return 3;
        else if (letter=='F' || letter=='H' || letter=='V' || letter=='W' || letter=='Y')
            return 4;
        else if (letter=='K')
            return 5;
        else if (letter=='J' || letter=='X')
            return 8;
        else if (letter=='Q' || letter=='Z')
            return 10;
        else
            return 0;
    }
}


public class Main {
    public static void main(String[] args) {
String word;

        Scanner m=new Scanner(System.in);

        System.out.println("Enter a word: ");

        word=m.nextLine();
int score= Scrabble.calculatescore(word);

System.out.println("The score of: "+ word +" is : " +score);
    }

```
