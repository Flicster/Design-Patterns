package com.adapter;

public class IteratorAdapter implements Enumeration {
    Iterator iterator;

    public IteratorAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    public void hasMoreElements() {
        iterator.hasNext();
    }

    public void nextElement() {
        iterator.next();
    }

}
