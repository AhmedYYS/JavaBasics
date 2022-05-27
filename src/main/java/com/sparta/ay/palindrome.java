package com.sparta.ay;

public class palindrome {

    public static void main(String[] args) {
        String word = "ahmed";
        String tester = palindromeChecker(word);
        System.out.println(tester);
    }

    public static String palindromeChecker(String sentence) {

        String reversed = "";
        String storedWords = sentence;
        String storedWordLower = storedWords.toLowerCase();
        int length = storedWordLower.length();



        for (int i = length - 1; i >= 0; i--) {
            reversed += storedWordLower.charAt(i);
        }
        if (storedWordLower.equals(reversed)) {
            return sentence + " " + "is the longest Palindrome";
        }
        return sentence + " " + "isn't a Palindrome";
    }

    public static boolean isPalindrome(String word) {

        String reversed = "";
        String storedWord = word ;
        String storedWordLower = storedWord.toLowerCase();
        if (storedWordLower.length() >= 3) {
            int length = storedWordLower.length();

            for (int i = length - 1; i >= 0; i--) {
                reversed += storedWordLower.charAt(i);
            }
            return storedWordLower.equals(reversed);
        } return false;
    }

    public static String longestPalindrome(String words) {

        StringBuilder result = new StringBuilder();

        String [] strArr = words.split(" ");

        for (String word : strArr) {
            if(isPalindrome(word)) {
                result.append(word).append(" ");
            }
        } return result.toString();
    }

}
