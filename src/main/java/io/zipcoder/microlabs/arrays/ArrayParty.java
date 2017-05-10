package io.zipcoder.microlabs.arrays;


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

    //TODO Define the method reverse
    public String reverse(String[] inputArray) {
        String output = "*** Output ***\n";
        String[] reversedList = new String[inputArray.length];
        String filledList= "";
        

        for(int i=0; i<inputArray.length;i++){
            reversedList[i]= inputArray[i];
        }

        for (int i =reversedList.length-1; i>=0; i--) {
            if (i>0){
                filledList+=reversedList [i]+ "\n" ;
            }
            else{
                filledList+=reversedList[i];
            }

        }


        return output + filledList;
    }


    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack


}
