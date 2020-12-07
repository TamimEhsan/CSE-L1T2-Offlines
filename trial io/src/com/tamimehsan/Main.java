package com.tamimehsan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");
        stringList.add("nope");
        stringList.add("string5");
        System.out.println((stringList instanceof Serializable) ? "is!" : "is not!");
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()){
            String string = iterator.next();
            if( string.equals("nope") ){
                iterator.remove();
            } else{
                System.out.println(string);
            }
        }

    }
}
