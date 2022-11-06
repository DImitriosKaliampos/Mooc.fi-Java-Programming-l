import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            
            System.out.println("Title: ");
            String title = sc.nextLine();
            
            if ( title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());

            System.out.println("Publication year: ");
            int publication = Integer.valueOf(sc.nextLine());
            
            Books booklist = new Books(title, pages, publication);
            books.add(booklist);

        }

        System.out.println("What information will be printed?");
        String answer = sc.nextLine();

        

        for (Books booklist: books) {
            if ( answer.equals("name")) {
                System.out.println(booklist.getName());
            }
            else {
                System.out.println(booklist);
            }
        }
    }
    
}
