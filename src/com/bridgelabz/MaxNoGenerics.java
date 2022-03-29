package com.bridgelabz;

public class MaxNoGenerics <T extends Comparable<T>> {
    private T x, y, z;
    public MaxNoGenerics(T x,T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void testMaximum() {
        MaxNoGenerics.testMaximum(this.x,this.y,this.z);
    }
    private static <T extends Comparable<T>> void testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        printMax(x,y,z,max);
    }
    private static <T> void printMax( T x, T y, T z, T max) {
        System.out.println("Max of "+x+","+y+" & "+z+" is "+max);
    }
    public static void main(String[] args){
        Integer x1 = 11, x2 = 10, x3 = 12;
        Float y1 = 4.1f, y2 = 5.2f, y3 = 3.3f;
        String z1 = "pear", z2 = "apple", z3 = "orange";
        new MaxNoGenerics<Integer>(x1,x2,x3).testMaximum();
        new MaxNoGenerics<Float>(y1,y2,y3).testMaximum();
        new MaxNoGenerics<String>(z1,z2,z3).testMaximum();
    }
}
