package com.inventario.main;

import com.inventario.gui.ProductRegistrationFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // SwingUtilities.invokeLater se asegura de que la creación de la GUI se realice en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> {
            // Crea una instancia de la ventana de registro de productos
            ProductRegistrationFrame frame = new ProductRegistrationFrame();
            // Hace visible la ventana
            frame.setVisible(true);
        });
    }
}
