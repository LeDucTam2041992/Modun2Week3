package ngay16_baitap;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Controller {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;

    public Queue<String> readFile(String filePath) {
        Queue<String> datas = new LinkedList<>();
        int size = 0;
        String line;
        try {
            file = new File(filePath);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                datas.add(line);
                size+= line.length();
            }
            bufferedReader.close();
            fileReader.close();
            System.out.printf("Source file has %d characters!\n",size);
        }catch (Exception e){
            System.out.println("File not found!");
        }
        return datas;
    }

    public void writeFile(String filePath, Queue<String> datas) {
        try {
            file = new File(filePath);
            if (!file.exists()) throw new FileNotFoundException();
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            while (!datas.isEmpty()) {
                String data = datas.poll();
                printWriter.println(data);
            }
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Done!");
        }catch (Exception e){
            System.out.println("File not found!");
        }
    }
}
