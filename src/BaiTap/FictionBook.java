package BaiTap;

public class FictionBook extends Book {
    private String category;

    public FictionBook(String bookCode, String name, String author, double price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price + " usd" +
                '}';
    }
}
