package com.example.arturmusayelyan.collections;

import java.util.Comparator;

/**
 * Created by artur.musayelyan on 26/03/2018.
 */

public class NameComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getName().compareTo(book2.getName());
    }
}
