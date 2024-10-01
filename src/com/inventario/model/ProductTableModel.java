package com.inventario.model;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;

public class ProductTableModel extends AbstractTableModel {
    // Lista que contiene los productos que se mostrarán en la tabla
    private final List<Product> productList;
    // Array que define los nombres de las columnas de la tabla
    private final String[] columnNames = {"ID", "Nombre", "Precio", "Cantidad"};

    // Constructor que inicializa la lista de productos como un ArrayList vacío
    public ProductTableModel() {
        this.productList = new ArrayList<>();
    }

    // Método que devuelve el número de filas, basado en el tamaño de la lista de productos
    @Override
    public int getRowCount() {
        return productList.size();
    }

    // Método que devuelve el número de columnas, basado en la longitud del array de nombres de columna
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    // Método que devuelve el valor de una celda específica, dada la fila y la columna
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Obtiene el producto correspondiente a la fila especificada
        Product product = productList.get(rowIndex);
        // Retorna el valor según la columna solicitada
        switch (columnIndex) {
            case 0: return product.getId();         // Columna ID
            case 1: return product.getNombre();     // Columna Nombre
            case 2: return product.getPrecio();     // Columna Precio
            case 3: return product.getCantidad();   // Columna Cantidad
            default: return null;                   // Retorna null en caso de columna inválida
        }
    }

    // Método que devuelve el nombre de la columna, basado en su índice
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    // Método para agregar un producto a la lista y notificar a la tabla que se ha añadido una nueva fila
    public void addProduct(Product product) {
        productList.add(product);  // Agrega el nuevo producto a la lista
        // Notifica a la tabla que una nueva fila ha sido insertada
        fireTableRowsInserted(productList.size() - 1, productList.size() - 1);
    }
}


