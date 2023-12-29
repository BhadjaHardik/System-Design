package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    String username;
    StockObservable observable;

    public MobileAlertObserver(String emailString, StockObservable observable) {
        this.username = emailString;
        this.observable = observable;
    }

    @Override
    public void Update() {
       sendMsgOnMMobile(username, "Stock added check now....");
    }

    private void sendMsgOnMMobile(String username,String Msg)
    {
        System.out.println("Hay, "+username+Msg);
    }

}
