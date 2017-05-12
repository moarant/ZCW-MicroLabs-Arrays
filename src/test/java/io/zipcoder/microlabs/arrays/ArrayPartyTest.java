package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

import java.util.Arrays;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("Should produce an exact copy of original string", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String [] breakfast = {"Sausage", "Eggs","Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms";
        //: When
        String actual = arrayParty.lastElement(breakfast);
        //: Then
        Assert.assertEquals("Should return the last item in the original array", expected, actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest(){
        //: Given
        String [] breakfast = {"Sausage", "Eggs","Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTomatoes";
        //: When
        String actual = arrayParty.lastButOne(breakfast);
        //: Then
        Assert.assertEquals("Should return the second to last item of the original array", expected, actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        //:Given
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage";

        //:When
        String actual = arrayParty.reverse(breakfast);
        //:Then
        Assert.assertEquals("Should return the list in reverse order", expected, actual);
    }

    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromeTrueTest() {

        //:Given
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();


        //:When
        Boolean actual1 = arrayParty.isPalindrome(palindromic);
        Boolean actual2= arrayParty.isPalindrome(breakfast);
        //:Then
        Assert.assertTrue("Should return true if the array is a palindrome", actual1);
        Assert.assertFalse("Should return false if the string is not a palindrome",actual2);

    }



    //TODO Define the method compressTest
    @Test
    public void compressTest(){
     //:Given
       String[] inputArray= {"1","1","3","3","3","2","2","2","1","1","1",
             "1","4","4","4","4"};
     ArrayParty arrayParty= new ArrayParty();
     String expected= "*** Output ***\n"+
             "1\n"+
             "3\n"+
             "2\n"+
             "1\n"+
             "4";

     //:When
    String actual = arrayParty.compress(inputArray);

     //:Then
        Assert.assertEquals("Should return one of each item if listed consecutively", expected, actual);
    }

    //TODO Define the method packTest
    @Test
    public void packTest(){
        //:Given
        char [] letters= {'a', 'a', 'a', 'a', 'b', 'c', 'c','a','a','d','e','e','e','e'};
        ArrayParty arrayParty= new ArrayParty();
        String expected= "*** Output ***\n"+
                "aaaa, b, cc, aa, d, eeee";

        //:When
        String actual = arrayParty.pack(letters);

        //:Then
        Assert.assertEquals("Should return an array with similar letters together", expected, actual);
    }


}
