import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {
    int bookid;
    String bookName;
    String authorName;

    Book(int bookid , String bookName , String authorName){
        this.bookid = bookid;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public int getbookid(){
        return bookid;
    }

    public String getBookName(){
        return bookName;
    }

    public String getAuthorName(){
        return authorName;
    }
    public static void main(String[] args) {
        ArrayList<Book> obj = new ArrayList<>();
        obj.add(new Book(101 , "HARRY POTTER" , "J.K ROWLING"));
        obj.add(new Book(102 , "THE LORD OF THE RINGS" , "JOHN RONALD REVEL TOLKIEN"));
        obj.add(new Book(103 , "HARRY POTTER" , "J.K ROWLING"));
        for(Book obj2 : obj){
            System.out.println("bookid = " + obj2.getbookid() + " , "+ "bookname = " + obj2.getBookName() +" , "+ "book writer = " + obj2.getAuthorName());
        }
    }
}
