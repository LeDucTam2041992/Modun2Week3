package ngay16_thuchanh1;

import java.io.*;

public class National {
    public static void main(String[] args) {
        File file;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        PrintWriter printWriter ;
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s","  MSV","    IP","   SDD","  GGF","SYS"," National");
        System.out.println();

        try {
            fileReader = new FileReader("data.dat");
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("\"","");
                String[] datas = line.split("\\,");
                for (int i = 0; i < datas.length; i++) {
                    System.out.printf("%-15s",datas[i]);
                }
                System.out.println();
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }




//        try {
//            file = new File("data.dat");
//            if(!file.exists()) file.createNewFile();
//            fileWriter = new FileWriter(file,true);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            printWriter = new PrintWriter(bufferedWriter);
//
//        printWriter.println("\"1.0.0.0\",\"1.0.0.255\",\"16777216\",\"16777471\",\"AU\",\"Australia\"");
//        printWriter.println("\"1.0.1.0\",\"1.0.3.255\",\"16777472\",\"16778239\",\"CN\",\"China\"");
//        printWriter.println("\"1.0.4.0\",\"1.0.7.255\",\"16778240\",\"16779263\",\"AU\",\"Australia\"");
//        printWriter.println("\"1.0.8.0\",\"1.0.15.255\",\"16779264\",\"16781311\",\"CN\",\"China\"");
//        printWriter.println("\"1.0.16.0\",\"1.0.31.255\",\"16781312\",\"16785407\",\"JP\",\"Japan\"");
//        printWriter.println("\"1.0.32.0\",\"1.0.63.255\",\"16785408\",\"16793599\",\"CN\",\"China\"");
//        printWriter.println("\"1.0.64.0\",\"1.0.127.255\",\"16793600\",\"16809983\",\"JP\",\"Japan\"");
//        printWriter.println("\"1.0.128.0\",\"1.0.255.255\",\"16809984\",\"16842751\",\"TH\",\"Thailand\"");
//        printWriter.close();
//        bufferedWriter.close();
//        fileWriter.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}