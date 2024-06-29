package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Classe Sale representa uma venda
public class Sale {
		String saleId; // Identificador único da venda
		Float TotalPrice; // Preço total da venda
		List<Product> items = new ArrayList<>(); // Lista de produtos vendidos na venda

		// Construtor da classe Sale para inicializar uma nova venda com produtos e preço total
		public Sale(Product[] items, Float TotalPrice) {
				this.items = List.of(items); // Inicializa a lista de produtos
				this.TotalPrice = TotalPrice; // Define o preço total da venda
				this.saleId = creatNewID(); // Gera um novo ID único para a venda
		}

		// Método para retornar a lista de produtos da venda
		public List<Product> getItems() {
				return items;
		}

		// Método para retornar o preço total da venda
		public Float getTotalPrice() {
				return TotalPrice;
		}

		// Método para definir o preço total da venda
		public void setTotalPrice(Float totalPrice) {
				TotalPrice = totalPrice;
		}

		// Método para retornar o ID da venda
		public String getSaleId() {
				return saleId;
		}

		// Método estático para gerar um novo ID único usando UUID
		static String creatNewID() {
				return UUID.randomUUID().toString();
		}
}
