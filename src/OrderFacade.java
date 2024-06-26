public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(Order order) {
        if (inventoryService.checkInventory(order)) {
            paymentService.processPayment(order);
            shippingService.shipOrder(order);
        }
    }
}

class InventoryService {
    public boolean checkInventory(Order order) {
        // Lógica para verificar o estoque
        return true;
    }
}

class PaymentService {
    public void processPayment(Order order) {
        // Lógica para processar o pagamento
    }
}

class ShippingService {
    public void shipOrder(Order order) {
        // Lógica para enviar o pedido
    }
}

class Order {
    // Detalhes do pedido
}
