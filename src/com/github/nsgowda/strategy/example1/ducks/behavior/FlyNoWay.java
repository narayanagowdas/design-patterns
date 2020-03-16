package com.github.nsgowda.strategy.example1.ducks.behavior;

public class FlyNoWay implements FlyBehavior {
  public void fly() {
    System.out.println("I can't fly");
  }
}
