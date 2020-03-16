package com.github.nsgowda.strategy.example1.ducks;

import com.github.nsgowda.strategy.example1.ducks.behavior.FlyWithWings;
import com.github.nsgowda.strategy.example1.ducks.behavior.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {

    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
