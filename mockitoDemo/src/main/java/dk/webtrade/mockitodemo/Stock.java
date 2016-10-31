package dk.webtrade.mockitodemo;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Oct 31, 2016 based on: https://www.tutorialspoint.com/mockito/mockito_first_application.htm
 * 
 */
public class Stock {
   private String stockId;
   private String name;	
   private int quantity;

   public Stock(String stockId, String name, int quantity){
      this.stockId = stockId;
      this.name = name;		
      this.quantity = quantity;		
   }

   public String getStockId() {
      return stockId;
   }

   public void setStockId(String stockId) {
      this.stockId = stockId;
   }

   public int getQuantity() {
      return quantity;
   }

   public String getTicker() {
      return name;
   }
}