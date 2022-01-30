package domaci;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class D_08_Jovana_Milicic_NS118QA4 {
    public static Scanner s;
    public static void main(String[] args) {

        s = new Scanner(System.in);

//        -----1.zadatak-----
//        System.out.println("Write a sentence: ");
//        String input = s.nextLine();
//        System.out.println("Number of words in a sentence is: " + countWordsInASentence(input));

//        ----2.zadatak-----
//        String someWord = "Motivation";
//        System.out.print("Character input: ");
//        char userInput = s.next().toUpperCase(Locale.ROOT).charAt(0);
//        System.out.print("Number of characters in a word: " + countCharacters(someWord, userInput));

//        -----4.zadatak-----
//        int [][] array = {{1, 2, 3, 4},
//                          {5, 6, 7, 8},
//                          {9, 10, 11, 12}
//        };
//
//        returnNewArray(array);
    }
    /**
     * 1. zadatak: Korisnik unosi recenicu. Potrebno je izbrojati koliko reci je bilo u recenici koju je korisnik
     * uneo i ispisati taj br u konzoli. Koristiti metode.
     * @param word
     * @return wordCount
     */
    public static int countWordsInASentence(String word) {
        String [] wordArray = word.split(" ");
        int wordCount = 0;
        for (int i = 0; i < wordArray.length; i++){
            wordCount++;
        }
        return wordCount;
    }

    /**
     * 2.zadatak: Inicijalizujte neki string. Korisnik unosi jedno slovo.
     * Prebrojati Koliko puta se slovo koje je korisnik uneo
     * ponavlja u stringu. Koristiti metode.
     * @param someWord, character
     * @return count
     */
    public static int countCharacters (String someWord, char character){
        int count = 0;
        for (int i = 0; i < someWord.length(); i++){
        char someWordChar = someWord.toUpperCase(Locale.ROOT).charAt(i);
            if (character==someWordChar){
                count++;
            }
        }
        return count;
    }

    /**
     * 4.* Zadatak:Deklarisati I inicijalizovati matricu n x m
     * Napisati metodu koja ce za primljenu matricu da napravi novu rotiranu za 90. Odnosno vrsi se zamena
     * redova I kolona kao sa slike. Metoda vraca tu novodobijenu matricu.
     * @param arr //to be converted
     * @return arr
     */

    public static int [][] returnNewArray (int [][] arr){
        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        return arr;
    }

}
