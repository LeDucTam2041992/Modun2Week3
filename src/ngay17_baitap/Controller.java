package ngay17_baitap;

import java.io.*;
import java.util.LinkedList;

public class Controller {
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private File file;
    public void writeProductToFile(Product product, String fileName){
        try {
            file = new File(fileName);
            if(!file.exists()) file.createNewFile();
            output = new ObjectOutputStream(new FileOutputStream(file,true));
            output.writeObject(product);
            output.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public LinkedList<Product> readProductsFromFile(String fileName){
        LinkedList<Product> products = new LinkedList<>();
        Product product = null;
        try {
            input = new ObjectInputStream(new FileInputStream(fileName));
            while ((product = (Product) input.readObject()) != null){
                products.add(product);
            }
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
}
