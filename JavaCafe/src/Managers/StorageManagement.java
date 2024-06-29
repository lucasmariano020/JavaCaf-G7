package Managers;

import Entities.Product;

public interface StorageManagement {

		// Método para adicionar um produto
		boolean addProduct(Object product);

		// Método para obter um produto
		Product getProduct(Product product);

		// Método para atualizar o preço de um produto
		boolean updateProductPrice(Product product, Float productPrice);

		// Método para atualizar a quantidade de um produto
		boolean updateProductQuantity(Product product, Integer productQuantity);

		// Método para excluir um produto
		boolean deleteProduct(Product product);

}
