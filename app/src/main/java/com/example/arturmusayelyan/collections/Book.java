package com.example.arturmusayelyan.collections;

import android.support.annotation.NonNull;

/**
 * Created by artur.musayelyan on 26/03/2018.
 */

public class Book implements Comparable<Book> {
    private String id;
    private String name;
    private int price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book() {

    }

    public Book(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


//    @Override
//    public int compareTo(@NonNull Book book) {
//        if (price > book.price) {
//            return 1;
//        } else if (price < book.price) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }


    @Override
    public int compareTo(@NonNull Book book) {
        return name.compareTo(book.getName());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }


}
