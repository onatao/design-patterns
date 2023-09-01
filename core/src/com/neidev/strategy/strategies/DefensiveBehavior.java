package com.neidev.strategy.strategies;

import com.neidev.strategy.Behavior;

public class DefensiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("The robot are moving defensively!");
    }
}
