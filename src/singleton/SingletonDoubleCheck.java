package singleton;
/**
 * it uses double check to let thread block the execution of synchronized block of code and execute
 * and create instance if not present
 * volatile is used to make sure the thread performs read and write for  singletonDoubleCheck instance variable
 * is created or not from memory (Instead of cache[Each core store their data in cache and periodically update to memory])
 */
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance() {
        if(singletonDoubleCheck == null) {
            synchronized (SingletonDoubleCheck.class) {
                if(singletonDoubleCheck == null) {
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}
