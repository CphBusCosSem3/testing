/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.mockitodemo;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk
 */
@RunWith(MockitoJUnitRunner.class)
public class PortfolioTest {
    
    	
   //@InjectMocks annotation is used to create and inject the object that is to be tested (the object that references the mocked away object)
   @InjectMocks 
   Portfolio portfolio = new Portfolio();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   IStockService stockService;

   @Test
   public void testGetMarketValue(){
       List<Stock> stocks = new ArrayList<>();
      Stock googleStock = new Stock("1","Google", 10);
      Stock microsoftStock = new Stock("2","Microsoft",100);
      stocks.add(googleStock);
      stocks.add(microsoftStock);
      portfolio.setStocks(stocks);
      //add the behavior of stock service when getPrice is called
      when(stockService.getPrice(googleStock)).thenReturn(50.00);
      when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);	
		
      //test the getMarketValue functionality
      //Assert.assertEquals(100500.0, portfolio.getMarketValue());
       
      //verify the behavior
      verify(stockService).getPrice(new Stock("3", "Tha-stock", 30));
   }
}
