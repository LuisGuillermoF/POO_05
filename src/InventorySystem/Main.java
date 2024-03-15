package InventorySystem;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // POINT #1 INVENTORY SYSTEM.
        Inventory inventory = new Inventory();
        Product product = new Product();
        Product product1 = new Product(1,"pencil",2000);
        Product product2 = new Product(2,"notebook",9000);
        Product product3 = new Product(3,"eraser",1000);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        String option;
        do {
            try {
                option = JOptionPane.showInputDialog("""
                        Welcome to your inventory control system.
                        1. Add a product.
                        2. Delete a product.
                        3. Show products.
                        4. Search products by name or category.
                        5. Exit
                        Select an option.
                        """);

                switch (option){
                    case "1":
                        String id = JOptionPane.showInputDialog("Type the id of the product");
                        int idSent = Integer.parseInt(id);
                        String nameSent = JOptionPane.showInputDialog("Type the name of the product: ");
                        String price = JOptionPane.showInputDialog("Type the price of the product: " + nameSent);
                        double priceSent = Double.parseDouble(price);

                        Product addedProduct = new Product(idSent,nameSent,priceSent);
                        inventory.addProduct(addedProduct);
                        JOptionPane.showMessageDialog(null,"Product added successfully.");

                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null,"""
                            Type the id of the product you want to remove from the list.
                            Available products at the moment:\s
                            """);
                        for (Product element : inventory.getProducts()){
                            JOptionPane.showMessageDialog(null,element.getId() + " " + element.getName());
                        }
                        idSent = Integer.parseInt(JOptionPane.showInputDialog("Id for product"));

                        inventory.removeProduct(idSent);
                        JOptionPane.showMessageDialog(null,"Product removed successfully.");

                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null,"Below are the current products: ");
                        JOptionPane.showMessageDialog(null,inventory.showProducts());


                        break;
                    case "4":
                        String buscar = JOptionPane.showInputDialog("write the article for search");
                        JOptionPane.showMessageDialog(null,inventory.filtrateProductsbyName(buscar));


                        break;
                    case "5":
                        System.out.println("Thanks for using your inventory system.");
                        break;
                }
            } catch (Exception e){
                System.out.println("Please enter a valid value!");
                break;
            }


        } while (!option.equals("5"));
    }
}
