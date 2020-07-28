package ngay17_baitap;

import java.io.FileWriter;
import java.util.LinkedList;

public class Run {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Product product1 = new Product("0001","Samsung galaxy s20","Samsung",19000000);
        Product product2 = new Product("0002","Iphone 11 pro max", "Apple",25000000);
        Product product3 = new Product("0003","MI 10 pro","Xiaomi",15000000);
        controller.writeProductToFile(product1,"obj.txt");
        controller.writeProductToFile(product2,"obj.txt");
        controller.writeProductToFile(product3,"obj.txt");
        LinkedList<Product> list = controller.readProductsFromFile("obj.txt");
        while (!list.isEmpty()) {
            Product pr = list.pop();
            System.out.println(pr);
        }
    }
}
