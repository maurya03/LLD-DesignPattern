package ObserverDesignPattern.Version1;

import ObserverDesignPattern.Version1.Shared.OrderDetails;

public class CreateOrderHelper {
    static OrderDetails createOrder()
    {
        return new OrderDetails();
    }
}
