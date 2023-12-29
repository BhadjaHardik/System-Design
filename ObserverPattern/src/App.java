import Observable.IphoneStockObservable;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {
        StockObservable observable = new IphoneStockObservable();
            
        NotificationAlertObserver alertObserver = new EmailAlertObserver("abc@gmail.com",observable);
        NotificationAlertObserver alertObserver2 = new EmailAlertObserver("XYZ@gmail.com",observable);
        NotificationAlertObserver mobileObserver = new MobileAlertObserver("Hardik",observable);

        observable.add(alertObserver);
        observable.add(alertObserver2);
        observable.add(mobileObserver);

        observable.setStock(10);   

    }
}
