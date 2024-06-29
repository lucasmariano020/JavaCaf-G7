package Managers;

import Entities.Product;
import Entities.Sale;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Db implements StorageFileManagement {

		// Definindo arquivos para produtos e vendas
		File productData = new File("productData.csv");
		File salesData = new File("salesData.csv");

		@Override
		public void addProductToFile(File file, Product product) throws IOException {
				try {
						// Escrevendo os dados do produto no arquivo CSV de produtos
						FileWriter fw = new FileWriter(productData);
						String line = (product.getProductName() + "," + product.getProductPrice() + "," +
										product.getProductQuantity() + "," + product.getValidity() + "," + product.getProductId());
						fw.write(line);
						fw.close();
				} catch (IOException e) {
						e.printStackTrace();
				}
		}

		@Override
		public void addSaleToFile(File file, Sale sale) {
				try {
						// Escrevendo os dados da venda no arquivo CSV de vendas
						FileWriter fw = new FileWriter(salesData);
						String line = (sale.getTotalPrice() + "," + sale.getItems().toString() + "," + sale.getSaleId());
						fw.write(line);
						fw.close();
				} catch (IOException e) {
						e.printStackTrace();
				}
		}

		@Override
		public void readFromFile(File file) {
				// Método para ler dados de um arquivo (a ser implementado)
		}
}
