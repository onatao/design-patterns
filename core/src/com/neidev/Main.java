package com.neidev;

import com.neidev.singleton.EagerSingleton;
import com.neidev.singleton.LazyHolderSingleton;
import com.neidev.singleton.LazySingleton;
import com.neidev.strategy.Behavior;
import com.neidev.strategy.context.Robot;
import com.neidev.strategy.strategies.AggressiveBehavior;
import com.neidev.strategy.strategies.DefensiveBehavior;
import com.neidev.strategy.strategies.NormalBehavior;

public class Main {

    public static void main(String[] args) {

        // Singleton implementations

        /**
         *Isnt possible to get the instance through the constructor method,
         * because its private, we need to call the class and getInstace() method
         */
        LazySingleton lazyInstance = LazySingleton.getInstance();
        System.out.println(lazyInstance);
        // Will show the same memory address even after recall
        lazyInstance = LazySingleton.getInstance();
        System.out.println(lazyInstance);

        /**
         *Isnt possible to get the instance through the constructor method,
         * because its private, we need to call the class and getInstace() method
         */
        EagerSingleton eagerInstance = EagerSingleton.getInstance();
        System.out.println(eagerInstance);
        // Will show the same memory address even after recall
        eagerInstance = EagerSingleton.getInstance();
        System.out.println(eagerInstance);

        /**
         *  Lazy Holder Singleton
         */
        LazyHolderSingleton lazyHolderInstace = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderInstace);
        // Will show the same memory address even after recall
        lazyHolderInstace = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderInstace);


        // Strategy implementations

        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();

        robot.setStrategy(normal);
        robot.move();

        robot.setStrategy(defensive);
        robot.move();

        robot.setStrategy(aggressive);
        robot.move();

        // Facade implementations

    }
}
