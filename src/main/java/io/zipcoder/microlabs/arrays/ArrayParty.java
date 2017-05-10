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

    public Boolean isPalindrome(String[] array1){
        String[] newArray= new String[array1.length];
        boolean isSame= false;

        for(int i=0;i<array1.length;i++){
            for(int j=array1.length-1;-1<j;j--){
                newArray[i]= array1[j];
            }
            if (newArray[i]== array1[i]){
                isSame=true;
            }
            else{
                isSame=false;
            }

        }

        return isSame;
    }

    //TODO Define the method compress

    //TODO Define the method pack


}
