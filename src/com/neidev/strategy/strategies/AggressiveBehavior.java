package com.neidev.strategy.strategies;

import com.neidev.strategy.Behavior;

public class AggressiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("The robot is moving aggressively!");
    }

}
