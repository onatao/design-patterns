package com.neidev.strategy.context;

import com.neidev.strategy.Behavior;

public class Robot {

    private Behavior strategy;

    public void setStrategy(Behavior strategy) {
        this.strategy = strategy;
    }

    /**
     * Delegates "move" action to
     * strategy, of Behavior.
     */
    public void move() {
        strategy.move();
    }
}
