package singleton;

/**
 * It is basically used when only one instance is required and should be available globally
 * Issue with this approach is the static variable gets loaded in memory while JVM load the class and
 * this make singletonEager object is present there even it is not get called via getInstance() method
 */
public class SingletonEager {
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance() {
        System.out.println("Already created instance");
        return singletonEager;
    }

}
