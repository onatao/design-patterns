package com.neidev.singleton;

/**
 *  "Eager" Singleton declare and initialize
 *  the instance  before the "Lazy"
 */
public class EagerSingleton {

    /**
     *  Declare and initialize the instance
     */
    private static EagerSingleton instance = new EagerSingleton();;

    /**
     *  When a private constructor is made,
     *  we cannot instance from outside the class.
     *
     *  The class control's its instance and
     *  shows the instance through a public method
     */
    private EagerSingleton() {
        super();
    }

    /**
     * Shows the instance
     * @return instance
     */
    public static EagerSingleton getInstance() {
        return instance;
    }

}
