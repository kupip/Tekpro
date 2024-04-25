package case_1;
// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************
import java.util.Scanner;
public class CountLetters{
    public static void main(String[] args){
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        
        //get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
        
        //convert to all upper case
        word = word.toUpperCase();
        
        try {
            for (int i=0; i < word.length(); i++)
                counts[word.charAt(i)-'A']++;
        } catch (ArrayIndexOutOfBoundsException e) {
            char temp = (char) (Integer.parseInt((e.getMessage().split(" ")[1])) + 'A');
            System.out.println("Not a letter, it's a \"" + temp + "\"");
        }
        //print frequencies
        System.out.println();
        for (int i=0; i < counts.length; i++)
            if (counts [i] != 0)
                System.out.println((char)(i +'A') + ": " + counts[i]);
        scan.close();
    }
}
