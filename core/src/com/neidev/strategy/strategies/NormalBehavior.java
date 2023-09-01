package com.neidev.strategy.strategies;

import com.neidev.strategy.Behavior;

public class NormalBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("The robot is normally moving..");
    }

}
