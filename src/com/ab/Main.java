package com.ab;


public class Main {

    public static void main(String[] args) {

        MyHashTable<MyTestingClass,Integer> a = new MyHashTable<>();
        a.put((new MyTestingClass("Askar agai is great teacher",100)),5);
        for(int i = 0 ; i<9999;i++) {
            a.put(new MyTestingClass(randomString(),randomNumber()),randomNumber());
        }
        a.printNumberOfElements();
    }

    public static int randomNumber() {
        Integer a = 0;
        for(int j = 0 ; j < 10;j++ ){
           a += (int) (Math.random() * 10);
        }
        return a;
    }

    public static String randomString() {
        String string = "";
        for(int i = 0;i < 7;i++) {
            string += (char) diapazon(65,90);
        }
        return string;
    }

    public static int diapazon(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}

