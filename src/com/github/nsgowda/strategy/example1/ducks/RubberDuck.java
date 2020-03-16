package com.github.nsgowda.strategy.example1.ducks;

import com.github.nsgowda.strategy.example1.ducks.behavior.FlyBehavior;
import com.github.nsgowda.strategy.example1.ducks.behavior.FlyNoWay;
import com.github.nsgowda.strategy.example1.ducks.behavior.QuackBehavior;

public class RubberDuck extends Duck {

  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    // quackBehavior = new Squeak();
    quackBehavior = () -> System.out.println("Squeak");
  }

  public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public void display() {
    System.out.println("I'm a rubber duckie");
  }
}
