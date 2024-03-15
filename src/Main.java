import Inventario.Inventory;
import Producto.ProductoEspesifico;

public class Main {
    public static void main(String[] args){
        ProductoEspesifico objProducto1 = new ProductoEspesifico(1,"lapiz",2000,"Papeleria",
                "big");
        ProductoEspesifico objProducto2 = new ProductoEspesifico(2,"cuaderno",6000,"Papeleria",
                "Norma");


        Inventory objInventori = new Inventory();

        objInventori.addProduct(objProducto1);
        objInventori.addProduct(objProducto2);

        objInventori.listarProductos();
    }

}