package ngay17_baitap;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode,nameProduct,designBy;
    private double price;

    public Product(String productCode, String nameProduct, String designBy, double price) {
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.designBy = designBy;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDesignBy() {
        return designBy;
    }

    public void setDesignBy(String designBy) {
        this.designBy = designBy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", designBy='" + designBy + '\'' +
                ", price=" + price +
                '}';
    }
}
