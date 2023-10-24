package ObserverDesignPattern.Version1.Shared;

public interface CreateOrderObserver {
    void newOrderCreated(OrderDetails od);
}
