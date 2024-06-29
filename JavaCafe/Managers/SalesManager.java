package Managers;

import Entities.Sale;
import java.util.HashMap;
import java.util.Map;

// Classe SalesManager implementa a interface SalesManagement
public class SalesManager implements SalesManagement {
    // Mapa para armazenar vendas usando o ID da venda como chave
    private Map<String, Sale> salesDatabase = new HashMap<>();

    // Método sobrescrito para processar uma venda e armazená-la no banco de dados
    @Override
    public boolean processSale(Sale sale) {
        salesDatabase.put(sale.getSaleId(), sale); // Adiciona nova venda ao mapa
        System.out.println("Sale processed: " + sale.getSaleId()); // Imprime mensagem de confirmação
        return true; // Retorna true para indicar que a venda foi processada com sucesso
    }

    // Método sobrescrito para cancelar uma venda com base no ID da venda
    @Override
    public boolean cancelSale(String saleId) {
        // Verifica se o ID da venda está presente no mapa
        if (salesDatabase.containsKey(saleId)) {
            salesDatabase.remove(saleId); // Remove a venda do mapa
            System.out.println("Sale canceled: " + saleId); // Imprime mensagem de confirmação
            return true; // Retorna true para indicar que a venda foi cancelada com sucesso
        } else {
            System.out.println("Sale ID not found: " + saleId); // Imprime mensagem de venda não encontrada
            return false; // Retorna false para indicar que a venda não pôde ser cancelada
        }
    }

    // Método sobrescrito para obter detalhes de uma venda com base no ID da venda
    @Override
    public Sale getSaleDetails(String saleId) {
        return salesDatabase.get(saleId); // Retorna os detalhes da venda com o ID especificado
    }
}
