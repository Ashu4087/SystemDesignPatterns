package singleton;

/**
 * It will lazy load the instance and create when it is required
 * the issue with it is not thread safe as while executing getInstance method 2 threds
 * may get singletonLazyLoad == null and then both will create the object
 * it can be resolved using synchronized keyword
 */
public class SingletonLazyLoad {
    private static SingletonLazyLoad singletonLazyLoad;

    private SingletonLazyLoad(){}

    public static SingletonLazyLoad getInstance() {
        if(singletonLazyLoad == null) {
            System.out.println("Creating the instance");
            singletonLazyLoad = new SingletonLazyLoad();
        }
        return singletonLazyLoad;
    }
}
