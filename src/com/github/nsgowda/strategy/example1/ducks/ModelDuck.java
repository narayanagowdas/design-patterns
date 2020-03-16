package com.github.nsgowda.strategy.example1.ducks;

import com.github.nsgowda.strategy.example1.ducks.behavior.FlyNoWay;
import com.github.nsgowda.strategy.example1.ducks.behavior.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I'm a model duck");
  }
}
