package com.github.nsgowda.strategy.example1.ducks.behavior;

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
