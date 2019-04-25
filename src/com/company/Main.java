package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    static <T> void create (LinkedList<Integer> arr, int size) {
        int n;
        for (int i =0; i<size;i++) {
            n = (int) (10 * Math.random() +1);
            arr.add(new Integer(n));

        }

    }

    static <T> void count(LinkedList<Integer> arr, int m, int n){
        create(arr,n);
        int count = 0;
        int count1 = 0;
        int count2=0;
        for(int i =0; i<arr.size(); i++){
            if(arr.get(i)== m)
                count ++;
            count1++;
            if(arr.get(i)<m)
                count2++;
        }
        System.out.println("Кількість елементів, які = m " + count);
        System.out.println("Кількість елементів " + count1);
        System.out.println("Кількість елементів, які < m " + count2);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("n = ");
        int n = Integer.parseInt(input.readLine());

        System.out.print("m = ");
        int m = Integer.parseInt(input.readLine());

        LinkedList<Integer> arr = new LinkedList<Integer>();
        count(arr,m,n);
        System.out.println(arr);

    }
}
