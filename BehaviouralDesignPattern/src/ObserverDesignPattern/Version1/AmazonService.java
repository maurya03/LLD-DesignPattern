package ObserverDesignPattern.Version1;

import ObserverDesignPattern.Version1.Shared.CreateOrderObserver;
import ObserverDesignPattern.Version1.Shared.OrderDetails;

import java.util.List;

public class AmazonService {
    private List<CreateOrderObserver> createOrderObserverList;

    public void register(CreateOrderObserver observer)
    {
        createOrderObserverList.add(observer);
    }
    public void unregister(CreateOrderObserver observer)
    {
        for(CreateOrderObserver obs : createOrderObserverList)
        {
            if(obs.equals(observer))
                createOrderObserverList.remove(observer);
        }
    }

    public void createOrder()
    {
        OrderDetails od = CreateOrderHelper.createOrder();
        for(CreateOrderObserver coo : createOrderObserverList)
        {
            coo.newOrderCreated(od);
        }
    }
}
