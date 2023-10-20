import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        long totalPrice = 0;
        int fiction1Category = 0;
        int pricegreaterThan100 = 0;
        ArrayList< Book> bookList = new ArrayList<>();
        Book programming1 = new ProgrammingBook("programming1", "programming 1", 300, "Philip K. Dick", "Java", " React Native");
        Book programming2 = new ProgrammingBook("programming2", "programming 2", 46, " Haruki Murakami", "javaScript", "Flutter");
        Book programming3 = new ProgrammingBook("programming3", "programming 3", 5030, " Katsuhiro Otomo", "C", "Xamarin");
        Book programming4 = new ProgrammingBook("programming4", "programming 4", 20220, "Kazuo Ishiguro", "C#", "PhoneGap");
        Book programming5 = new ProgrammingBook("programming5", "programming 5", 10660, " Mary Shelley", "Rubi", ".Net");

        Book fiction1 = new FictionBook("fiction1","Fiction 1", 2324, "Philip K. Dick", "Ubik");
        Book fiction2 = new FictionBook("fiction2","Fiction 2", 33, "Frank Herbert", "Dune");
        Book fiction3 = new FictionBook("fiction3","Fiction 3", 252, "Jorge Luis Borges", "The Ghost in the Shell");
        Book fiction4 = new FictionBook("fiction4","Fiction 4", 1180, "William Gibson", "vien tuong 1");
        Book fiction5 = new FictionBook("fiction5","Fiction 5", 90, "George Orwell", "vien tuong 1");

        bookList.add(programming1);
        bookList.add(programming2);
        bookList.add(programming3);
        bookList.add(programming4);
        bookList.add(programming5);
        bookList.add(fiction1);
        bookList.add(fiction2);
        bookList.add(fiction3);
        bookList.add(fiction4);
        bookList.add(fiction5);

        for (Book book: bookList) {
            totalPrice += book.getPrice();
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("vien tuong 1")) {
                    fiction1Category ++;
                }
            }
            if (book.getPrice() < 100) {
                pricegreaterThan100 ++;
            }
        }
        System.out.println("Total price: " + totalPrice);
        System.out.println("Number book category of \"vien tuong 1\" is "+fiction1Category);
        System.out.println("Number books have price less than 100 is " + pricegreaterThan100);
    }
}
