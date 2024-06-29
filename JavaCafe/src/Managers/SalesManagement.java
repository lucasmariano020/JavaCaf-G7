package Managers;

import Entities.Sale;

public interface SalesManagement {
  boolean processSale(Sale sale); //processa uma venda
  boolean cancelSale(String saleId);; //cancela uma venda pelo id
  Sale getSaleDetails(String saleId); //retorna os detalhes de uma venda pelo id
  
}
