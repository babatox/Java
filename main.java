class Product  { 
    private double buyingPrice;
    private double sellingPrice;

    public  double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setBuyingPrice(double buyingPrice){
        this.buyingPrice=buyingPrice;
    
    }
    public void setSellingPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }

     public double calculateProfit(){
        return sellingPrice - buyingPrice;
        
    }    
}

public class main{
    public static void main(String[] args){
        Product p=new Product();
        p.setBuyingPrice(100.00);
        p.setSellingPrice(300.00);
        System.out.println("Buying Price is"+p.getBuyingPrice());
        System.out.println("Selling Price is"+p.getSellingPrice());
        System.out.println("Profit is"+p.calculateProfit());
    }
}
        