package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String Email;
    StockObservable observable;

    public EmailAlertObserver(String emailString, StockObservable observable) {
        this.Email = emailString;
        this.observable = observable;
    }

    @Override
    public void Update() {
       sendMsgOnMMobile(Email, "Stock added check now....");
    }

    private void sendMsgOnMMobile(String Email,String Msg)
    {
        System.out.println("Hay, "+Email+"  "+Msg);
    }

}
