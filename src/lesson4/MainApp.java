package lesson4;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        String[] words ={"Apple","Orange","Cat","Dog","Monkey","Glass","Passport","Book","Monitor","Printer","Window",
        "Phone","Apple","Orange","Cat","Dog","Monkey","Glass","Passport","Book"};
        countUniqueWordsIn(words);

    }
    static  void countUniqueWordsIn(String[] array){
        HashMap<String, Integer> wordsToCount = new HashMap<>();
        final int firtsTime =1;
        for (String word :array){
            if (wordsToCount.containsKey(word)){
                int count= wordsToCount.get(word);
                wordsToCount.put(word,firtsTime);
            }

        }
        System.out.println("Uniq words in array");
        for(Map.Entry<String, Integer> wordEntry: wordsToCount.entrySet()){
            if (wordEntry.getValue()==firtsTime){
                System.out.println(wordEntry.getKey());
            }
        }
        System.out.println("Repeated words");
        for (Map.Entry<String,Integer> wordEntry: wordsToCount.entrySet()){
            System.out.println(wordEntry.getKey()+" :" +wordEntry.getValue());
        }

    }
}
