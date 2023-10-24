package ObserverDesignPattern.Version1;

import ObserverDesignPattern.Version1.Shared.CreateOrderObserver;
import ObserverDesignPattern.Version1.Shared.OrderDetails;

// Services will be implemented in microServices architecture not a monolith.
public class EmailService implements CreateOrderObserver {
    @Override
    public void newOrderCreated(OrderDetails od) {
        System.out.println("Email sent for newly created order!");
    }

    EmailService()
    {
        AmazonService as = new AmazonService(); // it will be implemented in another machine, so will be a
                                                // network call
        as.register(this);

    }
}
