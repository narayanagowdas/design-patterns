package com.github.nsgowda.strategy.example1;

import com.github.nsgowda.strategy.example1.ducks.Duck;
import com.github.nsgowda.strategy.example1.ducks.MallardDuck;
import com.github.nsgowda.strategy.example1.ducks.ModelDuck;
import com.github.nsgowda.strategy.example1.ducks.behavior.FlyRocketPowered;

public class MiniDuckSimulator1 {

  public static void main(String[] args) {

    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
