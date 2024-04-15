package org.jfcmc.jmm.escaping;


public class App {
    public static void main( String[] args ) {

        BookCollection bc = new BookCollection();


        bc.printAllBooks();

        System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
        bc.printAllBooks();
    }
}
