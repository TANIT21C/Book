import java.awt.*;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner Keyboard = new Scanner(System.in);

        String title;
        String author;
        double price;
        int quantity;
        String fileFormat;
        double weight;

        // Prompt the user to enter the title of the book
        System.out.println("Enter the title of the book: ");
        title = Keyboard.next();

        // Prompt the user to enter the author of the book
        System.out.println("Enter the author of the book: ");
        author = Keyboard.next();

        // Prompt the user to enter the price of the book
        System.out.println("Enter the price of the book: ");
        price = Keyboard.nextDouble();

        // Prompt the user to enter the quantity of the book
        System.out.println("Enter the quantity of the book: ");
        quantity = Keyboard.nextInt();

        // Prompt the user to enter the file format of the ebook (if available)
        System.out.println("Enter the file format of the ebook (if available): ");
        fileFormat = Keyboard.next();

        // Prompt the user to enter the weight of the physical book (if applicable)
        System.out.println("Enter the weight of the physical book (if available): ");
        weight = Keyboard.nextDouble();

        Book book = new Book(title,author,price,quantity);

        System.out.println("\nBook");
        System.out.println("Title:"+book.getTitle()+" "+"\nAuthor:"+ book.getAuthor()+" "+"\nPrice: RM"+ book.getPrice()+" "+"\nQuantity: "+ book.getQuantity());

        PhysicalBook physicalbook = new PhysicalBook("My son Story", "Nadine Gordimer",190, 1, 100);

        // Create an EBook object if the file format is provided
            EBook ebook = new EBook("Ghost & Monster World", "李梦生",34.1 ,1 ," .pdf");
            System.out.println("The E book details are as follows: ");
            System.out.println("Title: " + ebook.getTitle());
            System.out.println("Author: " + ebook.getAuthor());
            System.out.println("Price: " + ebook.getPrice());
            System.out.println("Quantity: " + ebook.getQuantity());
            System.out.println("File Format: " + ebook.getFileFormat());

            // Call the openBook() method on the ebook object
            ebook.openBook();
            ebook.downloadBook();
            ebook.validateFormat();

            // Create a PhysicalBook object if the file format is not provided
            PhysicalBook physicalBook = new PhysicalBook("My son Story", "Nadine Gordimer",190, 1, 600);
            System.out.println("The Physical book details are as follows: ");
            System.out.println("Title: " + physicalBook.getTitle());
            System.out.println("Author: " + physicalBook.getAuthor());
            System.out.println("Price: " + physicalBook.getPrice());
            System.out.println("Quantity: " + physicalBook.getQuantity());
            System.out.println("Weight: " + physicalBook.getWeight());

            // Call the calculateShippingCost() method on the physicalBook object
            double shippingCost = physicalBook.calculateShippingCost();
            System.out.println("The shipping cost for the physical book is: RM" + shippingCost);

            physicalbook.getWeight();
            physicalbook.calculateShippingCost();
    }

}