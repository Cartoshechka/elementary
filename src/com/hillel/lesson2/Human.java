package com.hillel.lesson2;

import java.util.Objects;

public class Human {

   private String name;
   private int age;

   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }

   public void setName(String name){
       this.name = name;
   }

   public void setAge(int age){
       this.age = age;
   }

    public boolean equals(Human human) {
        return Objects.equals(name, human.name);
    }

}
