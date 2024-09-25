// //    Assignment 1 Problem4

import java.util.Arrays;

public class SortWordBubbleSort {

        public static void main(String[] args) {
            String text = "To be or not to be, that is the question;"
                    + "Whether `tis nobler in the mind to suffer"
                    + " the slings and arrows of outrageous fortune,"
                    + " or to take arms against a sea of troubles,"
                    + " and by opposing end them?";

            // Define words: split on non-word characters and filter out empty strings
            String[] words = text.split("[^a-zA-Z]+");

            // Bubble sort algorithm
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = 0; j < words.length - 1 - i; j++) {
                    // Compare the current word with the next word
                    if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                        // Swap if the current word is greater
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }

            // Print the sorted words
            System.out.println("Sorted words:");
            for (String word : words) {
                if (!word.isEmpty()) { // Skip empty strings
                    System.out.println(word);
                }
            }
        }


}
