package com.hillel.lesson8;

public class Printer<T> {
    T value;

    public Printer(T Value) {
        this.value = Value;
    }

    @Override
    public String toString() {
        return "{{{{{{{{{{{{{ " + value + " }}}}}}}}}}}}}}}}}}";
    }

    public T getValue() {
        return value;
    }
}
