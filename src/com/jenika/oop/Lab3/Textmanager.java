package com.jenika.oop.Lab3.task1;
import java.util.*;

public class Textmanager {
       //Method to calculate number of words
       public int countwords(String text) {
              // String replacement = text.replaceAll("[^A-z| ]", "");
              String[] words = text.split("([^A-z| \\s]+)");
              return words.length;
       }

       //Method to calculate number of sentences
       public int countsentences(String text) {
              String[] sentences = text.split("[!?.:]+");
              return sentences.length;
       }

       //Method to calculate number of letters
       public int countletters(String text) {
              //int count = 0;

              //Counts each character except space
              //for(int i = 0; i < text.length(); i++) {
              String letters = text.replaceAll("[^A-z]", "");
              return letters.length();


//                     if(text.charAt(i) != ' ' && text.charAt(i) != '!' && text.charAt(i) !=',' && text.charAt(i) !=';' && text.charAt(i) !='.'
//                             text.charAt() ){
//                            count++;}
       }
       // return count;

       //Method to calculate number of vowels, consonants and spaces
       public void countVowelsAndConsonants(String text) {
              text = text.toLowerCase();
              int vowels = 0, consonants = 0, spaces = 0;
              for (int i = 0; i < text.length(); ++i) {
                     char ch = text.charAt(i);
                     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            ++vowels;
                     } else if ((ch >= 'a' && ch <= 'z')) {
                            ++consonants;
                     } else if (ch == ' ') {
                            ++spaces;
                     }
              }
              System.out.println("Number of vowels:" + vowels + "\n" + "Number of consonants:" + consonants + "\n" + "Number of spaces:" + spaces);
       }

       //Method to count most repeated word
       public void countMostRepeatedWord(String text) {
              int count;
              int maxCount = 0;
              String word;
              ArrayList<String> words = new ArrayList<>();
              String[] newText = text.toLowerCase().split("[,.!?;|[0-9]\\s]+");
              for (String s : newText) {
                     words.add(s);
              }
              //Determine the most repeated word
              for (int i = 0; i < words.size(); i++) {
                     //Count each word and store it in variable count
                     count = 1;
                     for (int j = i + 1; j < words.size(); j++) {
                            if (words.get(i).equals(words.get(j))) {
                                   count++;
                            }
                     }
                     //If maxCount is less than count then store value of count in maxCount
                     //and corresponding word to variable word
                     if (count > maxCount) {
                            maxCount = count;
                            word = words.get(i);
                            System.out.println("The word "+word+" repeats "+maxCount+" times");
                            System.out.println("Most repeated word:" + word);
                     }
              }

       }

       public static void longestWord(String text) {
              String[] longw = text.split("([,.!?;|0-9\\s]+)");
              Arrays.toString(longw);
              String longWord = " ";
              for (int i = 0; i < longw.length; i++) {
                     //for (int j = i + 1; j < longw.length; j++) {
                     if (longw[i].length() >= longWord.length()) {
                            longWord = longw[i];
                     }

              }

              System.out.println(longWord + " is longest word with " + longWord.length() + " characters");
       }
       public static void top5Words(String text) {




              HashMap<String, Integer> wordCountersMap = new HashMap<>();
              ArrayList<String> words = new ArrayList(Arrays.asList(text.toLowerCase().split("[,.!?;[0-9]\\s]+")));
              for (int i = 1; i <= 5; i++) {
                     int biggestCounter = 0;

                     for (String word : words) {
                            Integer counter = wordCountersMap.get(word);
                            counter = (counter == null) ? 1 : counter + 1;
                            wordCountersMap.put(word, counter);
                     }

                     for (Map.Entry<String, Integer> entry : wordCountersMap.entrySet()) {
                            int value = entry.getValue();
                            if (value > biggestCounter) {
                                   biggestCounter = value;
                            }
                     }
                     String key = getKeyFromValue(wordCountersMap, biggestCounter);
                     System.out.println(" Top " + i + " = " + key);
                     wordCountersMap.remove(key);
                     words.removeAll(Collections.singleton(key));
              }
       }

              public static String getKeyFromValue (Map < String, Integer > hashMap, Integer value){
                     for (String word : hashMap.keySet()) {
                            if (hashMap.get(word).equals(value)) {
                                   return word;
                            }
                     }
                     return null;
              }

}









