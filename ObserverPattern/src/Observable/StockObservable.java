package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver Observer);

    public void remove(NotificationAlertObserver Observer);

    public void notifySubscribers();

    public void setStock(int newStockAdded);

    public int getStock();
}
