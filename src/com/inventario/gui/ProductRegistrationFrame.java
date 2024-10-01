package com.inventario.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.inventario.model.*;

public class ProductRegistrationFrame extends JFrame {
    // Componentes de la UI para ingresar los detalles del producto
    private JTextField idField, nombreField, precioField, cantidadField;
    private JButton saveButton; // Botón para guardar el producto
    private ProductTableModel productTableModel; // Modelo de tabla para gestionar productos

    // Constructor del frame
    public ProductRegistrationFrame() {
        setTitle("Registro de Productos"); // Establece el título de la ventana
        setSize(600, 400); // Define el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configura la acción de cierre
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        this.productTableModel = productTableModel; // Inicializa el modelo de la tabla

        initComponents(); // Inicializa los componentes de la UI
    }

    // Método que inicializa los componentes de la interfaz gráfica
    private void initComponents() {
        // Panel principal con un GridLayout para organizar los componentes
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        // Etiquetas y campos de texto para el ID del producto
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        panel.add(idLabel); // Añade la etiqueta al panel
        panel.add(idField); // Añade el campo de texto al panel

        // Etiquetas y campos de texto para el nombre del producto
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        panel.add(nombreLabel);
        panel.add(nombreField);

        // Etiquetas y campos de texto para el precio del producto
        JLabel precioLabel = new JLabel("Precio:");
        precioField = new JTextField();
        panel.add(precioLabel);
        panel.add(precioField);

        // Etiquetas y campos de texto para la cantidad del producto
        JLabel cantidadLabel = new JLabel("Cantidad:");
        cantidadField = new JTextField();
        panel.add(cantidadLabel);
        panel.add(cantidadField);

        // Botón para guardar el producto
        saveButton = new JButton("Guardar Producto");
        panel.add(new JLabel()); // Añade un espacio vacío para mantener alineación en el layout
        panel.add(saveButton); // Añade el botón al panel

        // Añade el panel al centro del layout principal de la ventana
        add(panel, BorderLayout.CENTER);

        // Configura la acción del botón para guardar el producto
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveProduct(); // Llama al método que guarda el producto
            }
        });
    }

    // Método que guarda un producto cuando el usuario presiona el botón
    private void saveProduct() {
        try {
            // Obtiene los valores ingresados por el usuario
            int id = Integer.parseInt(idField.getText()); // Convierte el ID a un entero
            String nombre = nombreField.getText(); // Obtiene el nombre como texto
            double precio = Double.parseDouble(precioField.getText()); // Convierte el precio a double
            int cantidad = Integer.parseInt(cantidadField.getText()); // Convierte la cantidad a entero

            // Crea un nuevo objeto Product con los valores ingresados
            Product product = new Product(id, nombre, precio, cantidad);

            // Añade el producto al modelo de la tabla
            productTableModel.addProduct(product);

            // Limpia los campos de entrada después de guardar el producto
            idField.setText("");
            nombreField.setText("");
            precioField.setText("");
            cantidadField.setText("");

            // Muestra un mensaje de éxito al usuario
            JOptionPane.showMessageDialog(this, "Producto guardado con éxito");
        } catch (NumberFormatException ex) {
            // Si ocurre una excepción al convertir los datos (p. ej., si el usuario ingresa texto en un campo numérico)
            JOptionPane.showMessageDialog(this, "Por favor ingresa valores válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

