/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
*/

public class VowelCount {

  // Method to count the number of vowels in a string
    public static int countVowels(String sentence) {
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        sentence = sentence.toLowerCase();
        // Initialize a counter for vowels
        int vowelCount = 0;
        // Define a string containing all the vowels
        String vowels = "aeiou";
        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            // Check if the current character is a vowel using indexOf
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    // Main method to test the countVowels method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Number of vowels: " + countVowels(sentence));
    }
}
