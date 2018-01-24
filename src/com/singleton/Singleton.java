package com.singleton;

class Singleton1 {
    private static Singleton1 uniqueSingleton;

    private Singleton1() {};

    public static synchronized Singleton1 getInstance() {
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton1();
        }
        return uniqueSingleton;
    }
}

class Singleton2 {
    private static Singleton2 uniqueSingleton = new Singleton2();

    private Singleton2() {};

    public static Singleton2 getInstance() {
        return uniqueSingleton;
    }
}

class Singleton3 {
    private volatile static Singleton3 uniqueSingleton;

    private Singleton3() {};

    public static Singleton3 getInstance() {
        if (uniqueSingleton == null) {
            synchronized (Singleton3.class) {
                if (uniqueSingleton == null) {
                    uniqueSingleton = new Singleton3();
                }
            }
        }
        return uniqueSingleton;
    }
}