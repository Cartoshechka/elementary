package com.hillel.lesson3;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("model", 58);

        Bicycle.Seat seat = bicycle.new Seat();
        Bicycle.SteeringWheel steeringWheel = bicycle.new SteeringWheel();

        steeringWheel.left();
        steeringWheel.right();

        seat.up();
        seat.up();
        seat.up();
        seat.up();
        seat.up();
        seat.up();

        System.out.println(bicycle);

        seat.down();

        System.out.println(bicycle);

    }
}
