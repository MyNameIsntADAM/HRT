public class Order
{
    private int clientId, q, orderId;
    private String side;
    private double price;
    
    public Order(int clientId, String side, int q, double price, int orderId)
    {
        this.clientId = clientId;
        this.q = q;
        this.orderId = orderId;
        this.side = side;
        this.price = price;
    }
    
    public String confirmMessage()
    {
        return "C" + clientID + "." + orderId +
            " \"cnfrm\" " + side + " " + q + " " + price;
    }
    
    public String obDetails()
    {
        return "C" + clientId + "." + orderId + " " + q + " " + price;
    }
    
    public boolean isSell()
    {
        return side.equals("S");
    }
    
    private class ByPriceAscending extends Comparator<Order>
    { 
        public int compare(Order o1, Order o2)
        {
            if(o1.price <= o2.price)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
    
    private class ByPrice Descending extends Comparator<Order>
    { 
        public int compare(Order o1, Order o2)
        {
            if(o1.price >= o2.price)
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
}