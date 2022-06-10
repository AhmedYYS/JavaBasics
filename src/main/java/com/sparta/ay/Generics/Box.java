package com.sparta.ay.Generics;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {

        Box<String> numberBox = new Box<>();

        numberBox.setItem("Hello");
    }
}
