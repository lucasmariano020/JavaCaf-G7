package Entities;

// Classe Product representa um produto
public class Product {

		Long Id; // Identificador do produto (não utilizado no código fornecido)
		String productName; // Nome do produto
		String productId; // Identificador único do produto
		Integer productQuantity; // Quantidade do produto
		Float productPrice; // Preço do produto
		boolean validity; // Validade do produto

		// Construtor da classe Product para inicializar um novo produto com nome e preço
		public Product(String productName, Float productPrice) {
				this.productName = productName; // Define o nome do produto
				this.productId = creatNewID(); // Gera um novo ID único para o produto
				this.productQuantity = 0; // Define a quantidade inicial como 0
				this.productPrice = productPrice; // Define o preço do produto
				this.validity = true; // Define a validade inicial como true
		}

		// Método para retornar o nome do produto
		public String getProductName() {
				return productName;
		}

		// Método para definir o nome do produto
		public void setProductName(String productName) {
				this.productName = productName;
		}

		// Método para retornar o ID do produto
		public String getProductId() {
				return productId;
		}

		// Método para retornar a quantidade do produto
		public Integer getProductQuantity() {
				return productQuantity;
		}

		// Método para definir a quantidade do produto
		public void setProductQuantity(Integer productQuantity) {
				this.productQuantity = productQuantity;
		}

		// Método para retornar o preço do produto
		public Float getProductPrice() {
				return productPrice;
		}

		// Método para definir o preço do produto
		public void setProductPrice(Float productPrice) {
				this.productPrice = productPrice;
		}

		// Método para definir a validade do produto
		public void setValidity(boolean validity) {
				this.validity = validity;
		}

		// Método para retornar a validade do produto
		public boolean getValidity(){
				return validity;
		}

		// Método estático para gerar um novo ID único usando o método estático de Sale
		static String creatNewID(){
				return Sale.creatNewID();
		}

}
