package com.hillel.lesson3;

public class Bicycle {
    Integer height;
    String model;

    public Bicycle(String model, Integer height) {
        this.height = height;
        this.model = model;
    }

  /*  public void bicycle1(String model, Integer weight){
        this.height = weight;
        this.model = model;
    }*/

    @Override
    public String toString() {
        return "Bicycle{" +
                "weight=" + height +
                ", model='" + model + '\'' +
                '}';
    }



    public String ride(){
        return "Riding";
    }

    public class SteeringWheel{

        public void left (){
            System.out.println("left");
        }

        public void  right(){
            System.out.println("right");
        }

    }
    public class Seat {

        public void up(){
            height++;
            System.out.println("up");
        }

        public void down(){
            height--;
            System.out.println("down");
        }

    }
}
