public class Main {
    public static void main(String args[]) {

        String word = "mohammed Alzabni";
        String upperWord = word.toUpperCase();
        char[] letters = upperWord.toCharArray();  // نحول الكلمة إلى مصفوفة حروف
        int result = 0 ;
        for (char c : letters) {
//        System.out.println(c);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'L' || c == 'N' || c == 'R' || c == 'S' || c == 'T') {
                result = result + 1;
            } else if (c == 'D' || c == 'G') {
                result = result + 2;
            } else if (c == 'B' || c == 'C' || c == 'M' || c == 'P') {
                result = result + 3;
            } else if (c == 'F' || c == 'H' || c == 'V' || c =='W' || c =='Y') {
                result = result + 4;
            } else if (c =='K') {
                result = result + 5;
            } else if (c =='J' || c =='X') {
                result = result + 8;
            } else if (c =='Q'|| c =='Z') {
                result = result + 10;
            }


        }
        System.out.println("the result of " + word + " is : " + result);
    }
}
