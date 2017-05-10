package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals("The two string outputs are equal", expected, actual);
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
        Assert.assertEquals("The output of the method should be same", expected, actual);
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
        Assert.assertEquals("The output of the method should be same", expected, actual);
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
        Assert.assertEquals("The output of the method should be the same", expected, actual);
    }

    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromeTrueTest() {

        //:Given
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Bacon", "Eggs", "Sausage"};
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        boolean expected1= true;
        boolean expected2=false;

        //:When
        Boolean actual1 = arrayParty.isPalindrome(palindromic);
        Boolean actual2= arrayParty.isPalindrome(breakfast);
        //:Then
        Assert.assertTrue("Should return true", actual1);
        Assert.assertFalse("Should return false",actual2);

    }



    //TODO Define the method compressTest
    @Test
    public void compressTest(){
     //:Given
     String [] nums ={"1"+"1"+"3"+"3"+"3"+"2"+"2"+"2"+"1"+"1"+"1"+
             "1"+"4"+"4"+"4"+"4"};
     ArrayParty arrayParty= new ArrayParty();
     String expected= "*** Output ***\n"+
             "1\n"+
             "3\n"+
             "2\n"+
             "1\n"+
             "4\n";



     //:When
    String actual = arrayParty.compress(nums);

     //:Then
        Assert.assertEquals("The lists should match", expected, actual);
    }

    //TODO Define the method packTest


}
