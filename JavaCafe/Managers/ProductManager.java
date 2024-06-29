package Managers;

import Entities.Product;
import java.util.LinkedList;
import java.util.List;

public class ProductManager implements StorageManagement {

		// Lista para armazenar os produtos
		List<Product> productsList = new LinkedList<>();

		@Override
		public boolean addProduct(Object product) {
				// Adiciona um produto à lista e incrementa a quantidade em estoque
				productsList.add((Product) product);
				int inStock = ((Product) product).getProductQuantity();
				((Product) product).setProductQuantity(inStock + 1);
				return true;
		}

		@Override
		public Product getProduct(Product product) {
				// Retorna o produto se estiver na lista, caso contrário, retorna null
				if (productsList.contains(product)) {
						return product;
				} else {
						return null;
				}
		}

		@Override
		public boolean updateProductPrice(Product product, Float productPrice) {
				// Atualiza o preço do produto se ele existir na lista
				if (getProduct(product) != null) {
						product.setProductPrice(productPrice);
						return true;
				} else {
						return false;
				}
		}

		@Override
		public boolean updateProductQuantity(Product product, Integer productQuantity) {
				// Atualiza a quantidade do produto se ele existir na lista
				if (getProduct(product) != null) {
						product.setProductQuantity(productQuantity);
						return true;
				} else {
						return false;
				}
		}

		@Override
		public boolean deleteProduct(Product product) {
				// Remove o produto da lista, decrementa a quantidade em estoque e invalida o produto
				if (getProduct(product) != null) {
						int inStock = product.getProductQuantity();
						product.setProductQuantity(inStock - 1);
						product.setValidity(false);
						return true;
				} else {
						return false;
				}
		}

		// Método para rastrear o estoque de um produto pelo ID (a ser implementado)
		public void trackStock(Integer productId) {
				// Implementação para rastrear o estoque de um produto específico
		}
}
