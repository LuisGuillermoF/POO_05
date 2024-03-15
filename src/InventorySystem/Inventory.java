package InventorySystem;

import javax.swing.*;
import java.util.ArrayList;

public class Inventory {
    //Attributes
    private ArrayList<Product> Products = new ArrayList<>();
    //Constructors
    public Inventory(){
        this.Products = new ArrayList<>();
    }
    //Methods
    public void addProduct(Product product){
        this.Products.add(product);
    }
    public boolean removeProduct(int id){
        return this.Products.removeIf(product -> product.getId() == id);
    }

    public Object showProducts(){
        for (Product product : this.Products){
            JOptionPane.showMessageDialog(null,"Available products: "+ product.getId() + " " + product.getName() + " Price: " + product.getPrice());
        }
        return null;
    }

    public Product filtrateProductsbyName(String name){
        for (Product product : this.Products){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    //Setters and getters

    public ArrayList<Product> getProducts() {
        return Products;
    }

    //ToString
}
