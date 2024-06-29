# Java Café System - Data de Atualização: 29/06/2024

## Descrição do Projeto
Este projeto foi realizado para a disciplina de Programação Orientada a Objetos. O objetivo é desenvolver uma aplicação Java amigável para gerenciar as transações de vendas, inventário e interações com clientes de um café. O projeto, denominado "Java Café", simula um sistema de ponto de venda (POS) para um pequeno café, gerenciando o processamento de pedidos, atualizações de inventário e relatórios de vendas.

## Integrantes do Grupo
- Lorena Salvador - n° USP 14589938
- Paloma Barduchi Barbin - n° USP 12677641
- Lucas Jacinto Mariano - n° USP 11879922

## Estrutura do Projeto
O projeto está organizado em diferentes pacotes conforme a funcionalidade:

### Entities
- **Product.java**: Gerencia os produtos do café, incluindo nome, preço e quantidade em estoque.
- **Sale.java**: Representa uma venda, incluindo os itens vendidos, a quantidade e o valor total.

### GUI
- **JavaCafeGUI.java**: Implementa a interface gráfica do usuário (GUI) usando JavaFX ou Swing, permitindo interação fácil e intuitiva com o sistema.

### Managers
- **DB.java**: Gerencia a conexão e operações com o banco de dados.
- **ProductManager.java**: Gerencia as operações relacionadas aos produtos, como adicionar, remover e atualizar produtos no estoque.
- **SalesManagement.java**: Gerencia as vendas, incluindo o processamento de pedidos e geração de recibos.
- **StorageFileManagement.java**: Gerencia o armazenamento e recuperação de dados de inventário e registros de vendas.
- **StorageManagement.java**: Implementa a lógica para manutenção do inventário e alertas de baixo estoque.

### Main
- **Main.java**: Classe principal que contém o método `main`. Inicializa e executa o programa, incluindo testes básicos de criação e cancelamento de compras.
- **TestSalesManagement.java**: Contém testes unitários para as funcionalidades de gerenciamento de vendas.

## Requisitos do Projeto
### Objetivo
Desenvolver uma aplicação Java amigável para gerenciar as transações de vendas, inventário e interações com clientes de um café.

### Funcionalidades a Implementar

#### Interface de Usuário
- Design de uma GUI simples e intuitiva usando JavaFX ou Swing.
- A interface deve incluir botões para adicionar itens a um pedido, finalizar transações e visualizar relatórios de inventário e vendas.

#### Processamento de Pedidos
- Permitir que os usuários criem novos pedidos, adicionem itens do menu e finalizem as vendas.
- Cada pedido deve calcular o custo total, aplicar impostos e gerar um recibo.

#### Gerenciamento de Inventário
- Implementar um sistema para rastrear os níveis de estoque dos produtos.
- Atualizar automaticamente o inventário quando os pedidos são processados.
- Alertar os usuários quando os níveis de estoque estiverem baixos.

#### Tratamento de Exceções
- Implementar um tratamento robusto de erros para entradas de usuários, gerenciamento de inventário e operações de arquivo.
- Implementar exceções personalizadas para cenários específicos, como "Fora de Estoque" ou "Tipo de Pagamento Inválido".

#### Armazenamento de Dados
- Usar I/O de arquivo para armazenar e recuperar dados de inventário e registros de vendas.
- Garantir a persistência dos dados entre sessões salvando as alterações em um arquivo.

### Documentação
- Documentar minuciosamente o código, especialmente os métodos públicos e interfaces de usuário.
- Fornecer um manual do usuário que explique como operar o sistema POS.

### Apresentação
- Preparar uma demonstração do sistema POS em ação.
- Destacar as principais funcionalidades e discutir os desafios enfrentados durante o desenvolvimento.

### Resultados dos Testes
- Não foi possível fazer completamente as funcionalidades propostas para o sistema
- Incluiu-se um teste por padrão para verificação de algumas funções implementadas

### Como Rodar
1. **Abra o site replit.com**
2. Crie um novo projeto em java
3. Delete os arquivos da pasta automaticamente criada
4. Suba a pasta descompactada do projeto contida nesse github para o repositório do projeto no Replit
5. No terminal, escreva ls para ver os arquivos da pasta atual
6. Navegue até a main usando o comando cd “pasta”. Exemplo: cd src, cd main
7. Quando chegar na pasta main, digite javac main.java para compilar o arquivo
8. Depois digite java main.java para executar o arquivo
9. A saída será um teste que roda automático no terminal com as funções implementadas.

## Comentários
O grupo não conseguiu implementar todas as funcionalidades, junto a interface GUI. Porém foi colocado um teste para demonstração das funções de venda, evidenciando o funcionamento parcial da solução.

O grupo teve grande dificuldade em construir o código e integrar todas as partes. Também foi difícil fazer o correto versionamento pelo Github, optando então pelo Replit, que também tem suas limitações.

No geral o desenvolvimento da solução proporcionou ao grupo maior entendimento da utilização da swing do java, assim como a organização de arquivos, classes, interfaces, etc. Também houve aprendizado sobre o Github, pois até então o contato fora pouco.

