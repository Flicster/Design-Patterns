package com.adapter;

public class EnumerationAdapter implements Iterator {
    Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public void hasNext() {
        enumeration.hasMoreElements();
    }

    public void next() {
        enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
