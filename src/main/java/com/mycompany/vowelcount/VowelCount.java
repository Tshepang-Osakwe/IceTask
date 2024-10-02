/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;

/**
 *
 * @author RC_Student_lab
*/

public class VowelCount {

  
    public static int countVowels(String sentence) {
       
        sentence = sentence.toLowerCase();
        int vowelCount = 0;
        String vowels = "aeiou";
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        String sentence = "Hello, how many vowels are in this sentence?";
        System.out.println("Number of vowels: " + countVowels(sentence));
    }
}
