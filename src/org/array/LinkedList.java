package org.array;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedList {
	public static void main(String[] args) {
    List l=new ArrayList<>() ;
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(50);
    l.add(60);
    l.add(70);
    l.add(80);
    System.out.println(l);
    l.add(3,35);
    System.out.println(l);
    l.remove(2);
    System.out.println(l);
    System.out.println("Melvin added code");
    
	}

}
