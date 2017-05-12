package io.zipcoder.microlabs.arrays;

/**
 * Created by mollyarant on 5/11/17.
 */
public class Dog extends Animal{

    boolean isMammal;
    boolean isCarnivorous;
    String color;

    public Dog(String color){
        super(true, true);
        this.color= color;
    }
}
