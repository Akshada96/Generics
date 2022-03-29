package com.bridgelabz;

public class MaxNoGenerics {
    public static void main(String[] args){
        Integer x1 = 11, x2 = 10, x3 = 12;
        Float y1 = 4.1f, y2 = 5.2f, y3 = 3.3f;
        String z1 = "pear", z2 = "apple", z3 = "orange";
        printMax(x1,x2,x3);
        printMax(y1,y2,y3);
        printMax(z1,z2,z3);
    }
    public static <T extends Comparable<T>> void printMax(T x,T y,T z){
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        System.out.println("Max of "+x+","+y+" & "+z+" is "+max);
    }
}
