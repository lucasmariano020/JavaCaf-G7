package Managers;

import Entities.Product;
import Entities.Sale;

import java.io.File;
import java.io.IOException;

public interface StorageFileManagement {

		// Método para adicionar um produto a um arquivo
		void addProductToFile(File file, Product product) throws IOException;

		// Método para adicionar uma venda a um arquivo
		void addSaleToFile(File file, Sale sale);

		// Método para ler dados de um arquivo (a ser implementado na implementação da interface)
		void readFromFile(File file);

}
