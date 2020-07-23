import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        do {
            try {
                System.out.println("Enter number : ");
                double numb = sc.nextDouble();
                System.out.println(numb);
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Data invalid");
                sc.nextLine();
            }
        } while (!check);
    }
}



