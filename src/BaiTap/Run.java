package BaiTap;

import java.util.Scanner;

public class Run {
    static  Book[] books = new Book[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        books[0] = new ProgrammingBook("10001","JavaCore","Jame",200,"English",
                "Spring");
        books[1] = new ProgrammingBook("10002","PHP","John",150,"English",
                "MPV");
        books[2] = new ProgrammingBook("10003","ComputerLanguage","Bin",130,"English",
                "Non");
        books[3] = new ProgrammingBook("10004","JavaScrip","Tom",160,"JS",
                "WebStorm");
        books[4] = new ProgrammingBook("10005","JavaBoot","Jerry",185,"Java","" +
                "SPV");
        books[5] = new FictionBook("10006","Space","Son",220,"Space");
        books[6] = new FictionBook("10007","Star","Myr",190,"Universe");
        books[7] = new FictionBook("10008","The Sun","Mary",250,"Universe");
        books[8] = new FictionBook("10009","Robot and Future","PepGu",170,"Machine");
        books[9] = new FictionBook("10010","Quantum Era","ClackKen",120,"Internet");
        int choice = -1;
        do {
            System.out.println("----------------Menu----------------");
            System.out.println("1. Find book of name!");
            System.out.println("2. Total price of books!");
            System.out.println("3. Find books of language!");
            System.out.println("4. Sort book of price!");
            System.out.println("5. Find book of Price");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 : findBook();break;
                case 2 : totalPrice();break;
                case 3 : findBookOfLanguage();break;
                case 4 : sortBookOfPrice();break;
                case 5 : findBookOfPrice();break;
            }
        } while (choice !=0);
    }

    private static void findBookOfPrice() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < books.length; i++) {
            Book currentElement = books[i];
            int k;
            for (k = i-1; k >=0 && books[k].getPrice() > currentElement.getPrice() ; k--) {
                books[k+1] = books[k];
            }
            books[k+1] = currentElement;
        }

        System.out.println("Enter price of book :");
        double price = sc.nextDouble();
        Book book = binarySearch(books,0,books.length,price);
        System.out.println("The book have price nearest is : ");
        System.out.println(book);
    }

    public static Book binarySearch(Book[] books, int low, int high, double value) {
        if (high >= low) {
            int mid = low + (high-low)/2;
            if (books[mid].getPrice() == value) return books[mid];
            else if (books[mid].getPrice() > value) return binarySearch(books, low, mid-1, value);
            return binarySearch(books,mid+1, high, value );
        }
        if (Math.abs(books[high].getPrice()-value) > Math.abs(books[low].getPrice()-value)) return books[low];
        return books[high];
    }

    private static void sortBookOfPrice() {
//        *******BubbleSortByStep*******
//        boolean needNextPass = true;
//        for (int i = 1; i < books.length && needNextPass; i++) {
//            needNextPass = false;
//            for (int j = 0; j <books.length - i ; j++) {
//                if (books[j].getPrice() > books[j+1].getPrice()){
//                    Book temp = books[j];
//                    books[j] = books[j+1];
//                    books[j+1] = temp;
//                    needNextPass = true;
//                }
//            }
//        }
//        *********SelectionSort************
//        for (int i = 0; i < books.length - 1; i++) {
//            Book currentMin = books[i];
//            int currentMinIndex = i;
//            for (int j = i + 1; j < books.length; j++) {
//                if (currentMin.getPrice() > books[j].getPrice()) {
//                    currentMin = books[j];
//                    currentMinIndex = j;
//                }
//            }
//            if (currentMinIndex != i) {
//                books[currentMinIndex] = books[i];
//                books[i] = currentMin;
//            }
//        }
//        ***************insertionSort***************
        for (int i = 1; i < books.length; i++) {
            Book currentElement = books[i];
            int k;
            for (k = i-1; k >=0 && books[k].getPrice() > currentElement.getPrice() ; k--) {
                books[k+1] = books[k];
            }
            books[k+1] = currentElement;
        }
        for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
        }
    }

    private static void findBookOfLanguage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the languages book you wanto find :");
        String lanFInd = sc.nextLine();
        int count = 0;
        for (Book b:books) {
            if (b instanceof ProgrammingBook) {
                ProgrammingBook book = (ProgrammingBook) b;
                if (lanFInd.equalsIgnoreCase(book.getLanguage())) count++;
            }
        }
        System.out.println("The number books have language is " + lanFInd + " is " + count);
    }

    private static void totalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < books.length; i++) {
            totalPrice+= books[i].getPrice();
        }
        System.out.println("Total price = " + totalPrice + " usd!");
    }

    private static void findBook() {
        Scanner sc = new Scanner(System.in);
        boolean isHas = false;
        System.out.println("Enter the books name you want to find :");
        String nameFind = sc.nextLine();
        for (int i = 0; i < books.length; i++) {
            String nameBook = books[i].getName();
            if (nameBook.equalsIgnoreCase(nameFind)) {
                System.out.println(books[i]);
                isHas = true;
                break;
            }
        }
        if (!isHas) System.out.println("Do not have your books. Please check again!");
    }
}
