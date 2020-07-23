package ngay16_baitap;

import java.util.Queue;
import java.util.Scanner;

public class RunCopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source file : ");
        String sourceFile = scanner.nextLine();
        System.out.println("Enter the target file : ");
        String targetFile = scanner.nextLine();
        Controller controller = new Controller();
        Queue<String> datas = controller.readFile(sourceFile);
        controller.writeFile(targetFile,datas);
    }
}
