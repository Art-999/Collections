package com.example.arturmusayelyan.collections;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Book book1 = new Book("8", "Aramyan", 5400);
        Book book2 = new Book("15", "Vasilyan", 1200);
        Book book3 = new Book("7", "Simonyan", 800);
        Book book4 = new Book("3", "Barsexyan", 3750);

        TreeSet<Book> bookTreeSet = new TreeSet<>();
        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);
        //Log.d("Example",bookTreeSet.toString());
        for (Book book : bookTreeSet) {
            // Log.d("Example",book.getId()+" "+book.getName()+" "+book.getPrice());
        }
//        Log.d("Example",bookTreeSet.first().toString());
//        Log.d("Example",bookTreeSet.last().toString());

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("a");
        priorityQueue.add("w");
        priorityQueue.add("b");
        priorityQueue.add("c");
//        Log.d("Example", priorityQueue.toString());
//
//        Log.d("Example", priorityQueue.offer("w")+"");
//        Log.d("Example", priorityQueue.toString());
//        Log.d("Example", priorityQueue.peek());
//        priorityQueue.poll();
//        Log.d("Example", priorityQueue.peek());

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("a");
        arrayDeque.add("w");
        arrayDeque.add("c");
        arrayDeque.add("b");
        arrayDeque.add("v");
        //Log.d("Example",arrayDeque.toString());
        //arrayDeque.poll();
        // Log.d("Example",arrayDeque.peekFirst().toString());

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "w");
        hashMap1.put(9, "v");
        hashMap1.put(8, "l");
        hashMap1.put(7, "c");
        //Log.d("Example", hashMap1.toString());
        Set<Integer> set = hashMap1.keySet();
        // Log.d("Example", set.toString());

        //Log.d("Example", hashMap1.containsKey(1) + "");
        for (Map.Entry<Integer, String> entry : hashMap1.entrySet()) {
            //   Log.d("Example", entry.getKey() + " " + entry.getValue());
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(2, "w");
        treeMap.put(3, "m");
        treeMap.put(4, "p");
        //Log.d("Example", treeMap.toString());

        ArrayList<Book> bookslist = new ArrayList<>();
        bookslist.add(book1);
        bookslist.add(book2);
        bookslist.add(book3);
        bookslist.add(book4);
        Collections.sort(bookslist, new NameComparator());
        Log.d("Example", bookslist.toString());
        //Collections.binarySearch(bookslist,"Simonyan");

        int array[] = new int[5];
        Arrays.fill(array, 5);
        int index = Arrays.binarySearch(array, 5);
       // Log.d("Example", index + "");
        int arraySecond[] = new int[]{7, 8, 9, 10, 25, 7, 6, 8, 9, 7, 1};
        Arrays.sort(arraySecond);
        //Log.d("Example", Arrays.toString(arraySecond));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("w");
        arrayList.add("c");
        arrayList.add("m");
        arrayList.add("l");
        int index2 = Collections.binarySearch(arrayList, "m");
       // Log.d("Example",index2+"");


        ArrayDeque<Integer> arrayDeque1=new ArrayDeque<>();
        arrayDeque1.add(8);
        arrayDeque1.add(7);
        arrayDeque1.add(1);
        arrayDeque1.add(3);
        Log.d("Example",arrayDeque1.toString());
        TreeSet<Integer> treeSet=new TreeSet<>(arrayDeque1);
        Log.d("Example",treeSet.toString());
        //treeSet.last();

        if(arrayDeque1!=null && !arrayDeque1.isEmpty()){
            Log.d("Example",Collections.max(arrayDeque1)+"");
        }
        FirstClass firstClass=new FirstClass();
        FirstClass firstClass1=new SecondClass();
        Log.d("Example",firstClass.variable+"");
        Log.d("Example",firstClass1.variable+"");
        firstClass1.eat();
        Log.d("Example",firstClass1.eat());

        SecondClass secondClass=new SecondClass();

    }
}
