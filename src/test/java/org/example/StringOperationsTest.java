package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringOperationsTest {

    @Test(groups = {"GetLength"})
    public void testGetLength() {
        String str = "Winner Dinner";
        int expectedLength = 13;
        int actualLength = StringOperations.getLength(str);
        Assert.assertEquals(actualLength, expectedLength, "Длина строки неверна");
    }

    @Test(groups = {"empty"})
    public void testGetLength_empty() {
        String str = "";
        int expectedLength = 0;
        int actualLength = StringOperations.getLength(str);
        Assert.assertEquals(actualLength, expectedLength, "Длина пустой строки неверна");
    }

    @Test(groups = {"Concatenate"})
    public void testConcatenate() {
        String str1 = "Shalom";
        String str2 = "Izya";
        String expectedResult = "Shalom Izya";
        String actualResult = StringOperations.concatenate(str1, str2);
        Assert.assertEquals(actualResult, expectedResult, "Объединение строк неверно");
    }

    @Test(groups = {"empty"})
    public void testConcatenate_empty() {
        String str1 = "aBoBa";
        String str2 = "";
        String expectedResult = "aBoBa";
        String actualResult = StringOperations.concatenate(str1, str2);
        Assert.assertEquals(actualResult, expectedResult, "Объединение строк с пустой строкой неверно");
    }

    @Test(groups = {"Reverse"})
    public void testReverse() {
        String str = "IPHONE";
        String expectedResult = "ENOHPI";
        String actualResult = StringOperations.reverse(str);
        Assert.assertEquals(actualResult, expectedResult, "Переворачивание строки неверно");
    }

    @Test(groups = {"empty"})
    public void testReverse_empty() {
        String str = "";
        String expectedResult = "";
        String actualResult = StringOperations.reverse(str);
        Assert.assertEquals(actualResult, expectedResult, "Переворачивание пустой строки неверно");
    }

    @Test(groups = {"PositiveTest"})
    public void testIsPalindrome() {
        String str = "ShabahS";
        boolean expectedResult = true;
        boolean actualResult = StringOperations.isPalindrome(str);
        Assert.assertEquals(actualResult, expectedResult, "Проверка на палиндром неверна");
    }

    @Test(groups = {"IsPalindrome"})
    public void testIsnotPalindrome() {
        String str = "pointcar";
        boolean expectedResult = false;
        boolean actualResult = StringOperations.isPalindrome(str);
        Assert.assertEquals(actualResult, expectedResult, "Проверка на палиндром неверна");
    }

    @Test(groups = {"PositiveTest"})
    public void testChangeCase() {
        String str = "I WaNt PiZZa";
        String expectedResult = "i wAnT pIzzA";
        String actualResult = StringOperations.changeCase(str);
        Assert.assertEquals(actualResult, expectedResult, "Изменение регистра символов неверно");
    }

    @Test(groups = {"ChangeCase"})
    public void testAllUpperCase() {
        String str = "IZRAIL IS COOL";
        String expectedResult = "izrail is cool";
        String actualResult = StringOperations.changeCase(str);
        Assert.assertEquals(actualResult, expectedResult, "Изменение регистра всех заглавных букв неверно");
    }

    @Test(groups = {"ChangeCase"})
    public void testAllLowerCase() {
        String str = "russia is amazing";
        String expectedResult = "RUSSIA IS AMAZING";
        String actualResult = StringOperations.changeCase(str);
        Assert.assertEquals(actualResult, expectedResult, "Изменение регистра всех строчных букв неверно");
    }
}
