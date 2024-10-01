package singleton;

/**
 * It resolves the issue of Eager approach as all the nested class only get loaded when it's
 * got referred/used
 */
public class SingletonBillPugh {

    private SingletonBillPugh(){}

    private static class SingletonBillPughHelper {
        private static final SingletonBillPugh singletonBillPugh = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonBillPughHelper.singletonBillPugh;
    }
}
