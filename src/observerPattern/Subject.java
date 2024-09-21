package observerPattern;

/*
    observer pattern is used when a lot of dependent objects functionality needs to update on a particular object state change
 */

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
