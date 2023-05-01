package com.ab;

public class MyTestingClass {
    private String string;
    private Integer number;

    public MyTestingClass(String string,Integer number) {
        this.string = string;
        this.number = number;
    }
    public int hashCode() {
        int hash = 0;
        for (char c : string.toCharArray())
            hash = c + 31*hash;
        return Math.abs(hash+number*3);
    }
}