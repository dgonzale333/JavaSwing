package com.inventario.model;

public class Product {
    // Atributos privados para representar las propiedades de un producto
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor para inicializar un objeto Product con valores específicos
    public Product (int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity; // Se corrigió el nombre del parámetro "quntity" a "quantity"
    }

    // Métodos getters y setters para acceder y modificar los atributos privados

    public int getId() {
        return id; // Devuelve el valor del ID del producto
    }

    public void setId(int id) {
        this.id = id; // Establece el valor del ID del producto
    }

    public String getName() {
        return name; // Devuelve el nombre del producto
    }

    public void setName(String name) {
        this.name = name; // Establece el nombre del producto
    }

    public double getPrice() {
        return price; // Devuelve el precio del producto
    }

    public void setPrice(double price) {
        this.price = price; // Establece el precio del producto
    }

    public int getQuantity() {
        return quantity; // Devuelve la cantidad disponible del producto
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity; // Establece la cantidad disponible del producto
    }

    // Métodos adicionales que retornan los valores de los atributos en un formato de Object

    public Object getNombre() {
        return name; // Devuelve el nombre del producto como Object (similar a getName)
    }

    public Object getPrecio() {
        return price; // Devuelve el precio del producto como Object (similar a getPrice)
    }

    public Object getCantidad() {
        return quantity; // Devuelve la cantidad del producto como Object (similar a getQuantity)
    }
}

