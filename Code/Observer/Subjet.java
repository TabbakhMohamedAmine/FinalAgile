package Observer;

public interface Subjet {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
