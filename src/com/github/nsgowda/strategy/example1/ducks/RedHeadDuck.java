package com.github.nsgowda.strategy.example1.ducks;

import com.github.nsgowda.strategy.example1.ducks.behavior.FlyWithWings;
import com.github.nsgowda.strategy.example1.ducks.behavior.Quack;

public class RedHeadDuck extends Duck {

  public RedHeadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a real Red Headed duck");
  }
}
