package Homework;

import java.util.Iterator;
import java.util.LinkedList;

public class ControlStatement {

    public static void main(String[] args) {
//        ifStatement();
//        whileStatement();
//        forStatement();
        forEachStatement();
    }

    public static void ifStatement() {
        boolean itItTrue = true;
        if (itItTrue) {
            System.out.println("It ti s true");
        } else {
            System.out.println("It ti s false");
        }

//        if (1) {
//
//        }

        int a = 5;
        int b = 5;
        if (a > 5) {
            System.out.println("a > 5");
        } else if (b > 5) {
            System.out.println("a <= 5 && b > 5");
        }
    }

    public static void whileStatement() {
//        while(true) {
//            // 계속 실행된다!!
//        }

        int number = 5;
        while (number-- > 0) {
            System.out.println(number);
        }
    }

    public static void forStatement() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int k = 5;
        for (; k < 10; k = 100) {
            System.out.println("k = " + k);
        }
    }

    public static void forEachStatement() {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);

        System.out.println("fori");
        for (int i = 0; i < integerLinkedList.size(); i++) {
            System.out.println(integerLinkedList.get(i));
        }

        System.out.println("for-each");
        for (Integer i :
                integerLinkedList) {
            System.out.println(i);
        }

        System.out.println("iter");
        for (Iterator i = integerLinkedList.iterator(); i.hasNext(); ) {
            System.out.println(i.next());
        }
    }

    public static void forEachStatement_2() {
        int[] integers = new int[4];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        for (int i:
             integers) {
            System.out.println(i);
        }

        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

    }
}
