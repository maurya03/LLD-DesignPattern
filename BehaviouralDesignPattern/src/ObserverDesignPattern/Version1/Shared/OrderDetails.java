package ObserverDesignPattern.Version1.Shared;
/*
    Similar to story of FACADE.
    Story is like following...
        1. Amazon process order story and some services
        processOrder()
        {
        // Update inventory
        // send emails
        // send SMSs
        // send app notification
        // inform logistic team
        }
        all above there is different service
        In facade design pattern, we create a layer and create order helper, and that helper will contain
        all the services, and we will call those .
        processOrder()
        {
            createOrderHelper.processOrder();
        }
        createOrderHelper
        {
         static createOrderHelper() {
            It will call all the services, and each services will be on different project/files.
            }
        }
        The reason of doing this is to increase readability.

        Amazon
        {
            processOrder;
            CreateOrderHelper.processOrder;
        }
        CreateOrderHelper
        {
            processOrder(){
            inventoryService.update();
            logisticService.update();
            emailService.sendEmails();
            smsService.sendMsg();
         }
         Any time new service will come,
            1. We have to add that service in CreateOrderHelper.
            2. Compile that code.
            3. Re-deploy.
         Problem: Every time new service come up, then compile and re-deploy.
         Solution: Observer Design Pattern will solve this.

        // Is this a way a new service can be notified about Order without deploying
            the code of master service.
        // Everytime new service will be created it will not affect amazon service
 */
public class OrderDetails {
    int orderId;
    String address;
    int productId;
    int quantity;
    int amount;
    String phoneNumber;
    String Emails;
}
