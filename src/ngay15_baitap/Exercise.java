package ngay15_baitap;

public class Exercise {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(7,3,3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
