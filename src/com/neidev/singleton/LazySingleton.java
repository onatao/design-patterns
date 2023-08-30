package com.neidev.singleton;

/**
 *  "Lazy" Singleton declare the instance
 *   but don't initialize at the first moment.
 *
 */
public class LazySingleton {

    private static LazySingleton instance;

    /**
     *  When a private constructor is made,
     *  we cannot instance from outside the class.
     *
     *  The class control's its instance and
     *  shows the instance through a public method
     */
    private LazySingleton() {
        super();
    }

    /**
     * Shows the instance, and only if
     * the instance are equal to null
     * will iniciate a new one.
     * @return instance
     */
    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }

}
