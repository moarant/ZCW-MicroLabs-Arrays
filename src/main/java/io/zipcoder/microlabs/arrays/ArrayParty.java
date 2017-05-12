package io.zipcoder.microlabs.arrays;


import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayParty {

    public String printArray(String[] inputArray) {
        String output = "*** Output ***\n";
        String filledList = "";
        for (int i = 0; i < inputArray.length; i++) {
            if (i < (inputArray.length - 1)) {
                filledList += inputArray[i] + "\n";
            } else {
                filledList += inputArray[i];
            }
        }
        return output + filledList;
    }

    public String lastElement(String[] inputArray) {

        String lastNumber = "*** Output ***\n" + inputArray[inputArray.length - 1];

        System.out.println(lastNumber);


        return lastNumber;
    }


    public String lastButOne(String[] inputArray) {
        String secondToLast = "*** Output ***\n" + inputArray[inputArray.length - 2];
        System.out.println(secondToLast);

        return secondToLast;
    }


    public String reverse(String[] inputArray) {
        String output = "*** Output ***\n";
        String filledList = "";

        for (int i = inputArray.length - 1; i >= 0; i--) {
            {
                filledList += inputArray[i];
                if (i > 0) {
                    filledList += "\n";
                }
            }
        }
        return output + filledList;
    }


    //TODO Define the method isPalindrome
    public Boolean isPalindrome(String[] array1) {
        for (int i = 0; i < array1.length; i++) {
            int back = array1.length - (i + 1);
            if (array1[i] != array1[back]) {
                 return false;
            }
        }
        return true;
    }




    //TODO Define the method compress
    public String compress(String[] inputArray){
        String output= "*** Output ***";


        for(int i=0; i<inputArray.length-1;i++){
            if(inputArray[i]!=inputArray[i+1]){
                output+="\n" +inputArray[i];
            }
        }
        output+="\n" +inputArray[inputArray.length-1];
        return output;
}


    //TODO Define the method pack
    public String pack(char[] inputArray){
       String output= "*** Output ***\n";
       String combinedSameLetters= String.valueOf(inputArray[0]);

       for(int i=1; i<inputArray.length;i++){
           if(inputArray[i]==inputArray[i-1]){
               combinedSameLetters+= String.valueOf(inputArray[i]);
           }
           else{
               combinedSameLetters+=", "+String.valueOf(inputArray[i]);
           }
       }
        List<String> list = new ArrayList<String>(Arrays.asList(combinedSameLetters.split(" , ")));
        

       return output + StringUtils.join(list, "");
    }

}
