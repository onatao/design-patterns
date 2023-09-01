package com.neidev.singleton;

/**
 *  "Eager" Singleton declare and initialize
 *  the instance  before the "Lazy"
 */
public class LazyHolderSingleton {

    /**
     *  Declare and initialize the instance
     *  that will be on inner class (Holder)
     *
     *  Holders function is to encapsulate the
     *  instance.
     */
    private static class Holder {
        public static LazyHolderSingleton encapsulatedInstance = new LazyHolderSingleton();
    }

    /**
     *  When a private constructor is made,
     *  we cannot instance from outside the class.
     *
     *  The class control's its instance and
     *  shows the instance through a public method
     */
    private LazyHolderSingleton() {
        super();
    }

    /**
     * Shows the instance
     * @return instance
     */
    public static LazyHolderSingleton getInstance() {
        return Holder.encapsulatedInstance;
    }
}
