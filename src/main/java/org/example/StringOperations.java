package org.example;

public class StringOperations {

    // Определение длины строки
    public static int getLength(String str) {
        return str.length();
    }

    // Объединение строк
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Переворачивание строки
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Проверка на палиндром
    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Изменение регистра всех символов строки
    public static String changeCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}