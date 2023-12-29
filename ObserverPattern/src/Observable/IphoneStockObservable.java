package Observable;

import java.util.*;

import Observer.NotificationAlertObserver;

public class IphoneStockObservable implements StockObservable {

    public List<NotificationAlertObserver> lstObjObserver = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver Observer) {
        lstObjObserver.add(Observer);
    }

    @Override
    public void remove(NotificationAlertObserver Observer) {
        lstObjObserver.remove(Observer);
    }

    @Override
    public void notifySubscribers() {
        // TODO Auto-generated method stub
        for(NotificationAlertObserver Observer : lstObjObserver)
        {
            Observer.Update();
        }
    }

    @Override
    public void setStock(int newStockAdded) {
        if(stockCount ==0)
        {
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStock() {
        // TODO Auto-generated method stub
        return stockCount;
    }

}
