package dk.webtrade.mockitodemo;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Oct 31, 2016 
 */
import java.util.List;

public class Portfolio {
   private IStockService stockService;
   private List<Stock> stocks;

   public IStockService getStockService() {
      return stockService;
   }
   
   public void setStockService(IStockService stockService) {
      this.stockService = stockService;
   }

   public List<Stock> getStocks() {
      return stocks;
   }

   public void setStocks(List<Stock> stocks) {
      this.stocks = stocks;
   }

   public double getMarketValue(){
      double marketValue = 0.0;
      
      for(Stock stock:stocks){
         marketValue += stockService.getPrice(stock) * stock.getQuantity();
      }
      return marketValue;
   }
}