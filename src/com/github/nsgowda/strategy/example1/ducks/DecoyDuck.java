package com.github.nsgowda.strategy.example1.ducks;

import com.github.nsgowda.strategy.example1.ducks.behavior.FlyNoWay;
import com.github.nsgowda.strategy.example1.ducks.behavior.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    setFlyBehavior(new FlyNoWay());
    setQuackBehavior(new MuteQuack());
  }

  public void display() {
    System.out.println("I'm a duck Decoy");
  }
}
