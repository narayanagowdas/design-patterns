package com.github.nsgowda.strategy.example1;

import com.github.nsgowda.strategy.example1.ducks.DecoyDuck;
import com.github.nsgowda.strategy.example1.ducks.Duck;
import com.github.nsgowda.strategy.example1.ducks.MallardDuck;
import com.github.nsgowda.strategy.example1.ducks.ModelDuck;
import com.github.nsgowda.strategy.example1.ducks.RubberDuck;
import com.github.nsgowda.strategy.example1.ducks.behavior.FlyBehavior;
import com.github.nsgowda.strategy.example1.ducks.behavior.FlyRocketPowered;
import com.github.nsgowda.strategy.example1.ducks.behavior.QuackBehavior;

public class MiniDuckSimulator {

  public static void main(String[] args) {

    MallardDuck mallard = new MallardDuck();
    FlyBehavior cantFly = () -> System.out.println("I can't fly");
    QuackBehavior squeak = () -> System.out.println("Squeak");
    RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
    DecoyDuck decoy = new DecoyDuck();

    Duck model = new ModelDuck();

    mallard.performQuack();
    rubberDuckie.performQuack();
    decoy.performQuack();

    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
