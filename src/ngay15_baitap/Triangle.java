package ngay15_baitap;

public class Triangle {
    private double a,b,c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        boolean check = true;
        if (a <= 0 || b <= 0 || c <= 0) check = false;
        if (a + b <= c || b + c <= a || a + c <= b) check = false;
        if (!check) {
            throw new  IllegalTriangleException("Data invalid");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
