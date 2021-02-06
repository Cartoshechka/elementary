package com.hillel.lesson8;

public class Month {

    public static Month JANUARY = new Month("JANUARY");
    public static Month FEBRUARY = new Month("FEBRUARY");
    public static Month MARCH = new Month("MARCH");
    public static Month APRIL = new Month("APRIL");
    public static Month MAY = new Month("MAY");
    public static Month JUNE = new Month("JUNE");
    public static Month JULY = new Month("JULY");
    public static Month AUGUST = new Month("AUGUST");
    public static Month SEPTEMBER = new Month("SEPTEMBER");
    public static Month OCTOBER = new Month("OCTOBER");
    public static Month NOVEMBER = new Month("NOVEMBER");
    public static Month DECEMBER = new Month("DECEMBER");

    String name;

    private Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
