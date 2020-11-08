import java.io.*;
import java.util.Scanner;
public class countofvowels{
    static void countCharacterType(String str)
    {
        int vowel = 0, consonant = 0, specialChar = 0, digit = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowel++;
                else
                    consonant++;
            }
            else if (ch >= '0' && ch <= '9')
                digit++;
            else
                specialChar++;
        }

        System.out.println("Number of vowels: "+vowel);
        System.out.println("Number of consonant: "+consonant);
        System.out.println("Number of digit: "+digit);
        System.out.println("Number of special Character: "+specialChar);
    }
    static public void main (String[] args)
    {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        str = s.nextLine();
        countCharacterType(str);
    }
}
