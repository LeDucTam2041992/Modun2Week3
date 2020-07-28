package ngay18_baitap2;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
