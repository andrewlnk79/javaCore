package lesson4;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        String[] words = {"Apple", "Orange", "Cat", "Dog", "Monkey", "Glass", "Passport", "Book", "Monitor", "Printer", "Window",
                "Phone", "Apple", "Orange", "Cat", "Dog", "Monkey", "Glass", "Passport", "Book"};
        countUniqueWordsIn(words);


        static void countUniqueWordsIn (String[] array){
            HashMap<String, Integer> wordsToCount = new HashMap<>();
            final int firtsTime = 1;
            for (String word : array) {
                if (wordsToCount.containsKey(word)) {
                    int count = wordsToCount.get(word);
                    wordsToCount.put(word, firtsTime);
                }

            }
            System.out.println("Uniq words in array");
            for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
                if (wordEntry.getValue() == firtsTime) {
                    System.out.println(wordEntry.getKey());
                }
            }
            System.out.println("Repeated words in array");
            for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
                System.out.println(wordEntry.getKey() + " :" + wordEntry.getValue());
            }

        }
        System.out.println("Phone Book");
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.appendNewPhoneToName("8(000)999-99-99","Miller");
        phoneBook.appendNewPhoneToName("8(888)888-88-88","Cruse");
        phoneBook.appendNewPhoneToName("8(999)999-99-99","Sigal");
        phoneBook.appendNewPhoneToName("8(999)999-99-99","White");
        phoneBook.appendNewPhoneToName("8(777)777-77-77","Stone");
        phoneBook.appendNewPhoneToName("8(111)11-11-11","Teron");
        phoneBook.appendNewPhoneToName("8(333)999-99-99","User");
        System.out.println(phoneBook.getPhonesBy("Miller"));
        System.out.println(phoneBook.getPhonesBy("Cruse"));
        System.out.println(phoneBook.getPhonesBy("Sigal"));
        System.out.println(phoneBook.getPhonesBy("White"));
        System.out.println(phoneBook.getPhonesBy("Stone"));
        System.out.println(phoneBook.getPhonesBy("Teron"));
        System.out.println(phoneBook.getPhonesBy("User"));




    }
}



