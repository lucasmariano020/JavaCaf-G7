import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class JavaCafeGUI {

    public static void main(String[] args) {
        // Cria e configura a janela principal
        JFrame frame = new JFrame("Java Café POS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton addItemButton = new JButton("Add Item to Order");
        JButton checkoutButton = new JButton("Checkout");
        JButton inventoryButton = new JButton("View Inventory");
        JButton salesReportButton = new JButton("View Sales Report");

        buttonPanel.add(addItemButton);
        buttonPanel.add(checkoutButton);
        buttonPanel.add(inventoryButton);
        buttonPanel.add(salesReportButton);

        frame.add(buttonPanel, BorderLayout.NORTH);

        // Aqui precisa adicionar os listeners para os botoes e implementar as funcoes

        // Faz o frame visivel
        frame.setVisible(true);
    }
}