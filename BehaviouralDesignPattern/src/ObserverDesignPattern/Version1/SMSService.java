package ObserverDesignPattern.Version1;

import ObserverDesignPattern.Version1.Shared.CreateOrderObserver;
import ObserverDesignPattern.Version1.Shared.OrderDetails;

public class SMSService implements CreateOrderObserver {
    @Override
    public void newOrderCreated(OrderDetails od) {
        System.out.println("SMS sent for newly created order!");
    }

    SMSService()
    {
        AmazonService as = new AmazonService(); // it will be implemented in another machine, so will be a
        // network call
        as.register(this);
    }
}
