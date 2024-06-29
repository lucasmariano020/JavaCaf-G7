import Entities.Product;
import Entities.Sale;
import Managers.SalesManager;

public class TestSalesManagement {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager();

        // Criando alguns produtos
        Product product1 = new Product("Produto 1", 10.0f);
        Product product2 = new Product("Produto 2", 20.0f);

        // Criando uma venda
        Sale sale = new Sale(new Product[]{product1, product2}, 30.0f);

        // Processando a venda
        manager.processSale(sale);

        // Obtendo detalhes da venda
        Sale retrievedSale = manager.getSaleDetails(sale.getSaleId());
        System.out.println("Total price of retrieved sale: " + retrievedSale.getTotalPrice());

        // Cancelando a venda
        manager.cancelSale(sale.getSaleId());
    }
}
