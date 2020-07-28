package ngay18_baitap1;

public class Run {
    public static void main(String[] args) {
        NumberGenerator obj1 = new NumberGenerator();
        NumberGenerator obj2 = new NumberGenerator();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

    }
}
