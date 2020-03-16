package com.github.nsgowda.strategy.example1.ducks.behavior;

public class FakeQuack implements QuackBehavior {
  public void quack() {
    System.out.println("Qwak");
  }
}
