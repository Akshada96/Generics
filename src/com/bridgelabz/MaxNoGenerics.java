package com.bridgelabz;

public class MaxNoGenerics {
    public static void main(String[] args){
        Integer x1 = 11, x2 = 10, x3 = 12;
        checkMax(x1,x2,x3);
    }
    private static void checkMax(Integer x1, Integer x2, Integer x3) {
        Integer max = x1;
        if (x2.compareTo(max) > 0)
            max = x2;
        if (x3.compareTo(max) > 0)
            max = x3;
        System.out.println("Max of "+x1+","+x2+" & "+x3+" is "+max);
    }
}
