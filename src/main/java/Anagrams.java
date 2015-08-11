import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.io.Console;


public class Anagrams {
    public static void main(String[] args) {}


    public static Boolean isAnagram(String word1, String word2) {
        Console myConsole = System.console();

        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();
        char[] word1Array = word1.toCharArray();
        //Character[] charObjectArray1 = ArrayUtils.toObject(word1Array);

        ArrayList<Character> arrList1 = new ArrayList<Character>();

        for (char letter : word1Array) {
            arrList1.add(letter);
        }

        char[] word2Array = word2.toCharArray();
        //Character[] charObjectArray2= ArrayUtils.toObject(word2Array);

        ArrayList<Character> arrList2 = new ArrayList<Character>();

        for (char letter : word2Array) {
            arrList2.add(letter);
        }

        //ArrayList<Character> elementList1 = new ArrayList<Character>(Arrays.asList(charObjectArray1));
        //ArrayList<Character> elementList2 = new ArrayList<Character>(Arrays.asList(charObjectArray2));

        Collections.sort(arrList1);
        Collections.sort(arrList2);

        Boolean isAnagram = arrList1.equals(arrList2);
        System.out.println(arrList1);
        System.out.println(arrList2);

        return isAnagram;
    }

    public static ArrayList isAnagramMultipleWords(String words) {

        words = words.toUpperCase();
        ArrayList anagramList = new ArrayList();
        String[] wordsArray = words.split(" ");
        ArrayList<String> elementList = new ArrayList<String>(Arrays.asList(wordsArray));
        for(int i= 0;i<elementList.size();i++) {
            String currentword = elementList.get(0);
            elementList.remove(0);
            for(String otherword : elementList) {
                if(isAnagram(currentword,otherword)){
                    anagramList.add(currentword);
                }
            }
        }


        // for (String word1 : wordsArray) {
        //     for (String word2 :wordsArray) {
        //         if (isAnagram(word1, word2) && word1 != word2) {
        //             anagramList.add(word1);
        //             anagramList.add(word2);
        //         }
        //     }
        //
        //     }

        return anagramList;


        }


}
