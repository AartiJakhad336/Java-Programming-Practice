public class book {
    static int totleNoOfBooks;
    String author;
    String title;
    String isbn;

    boolean isBorrowed;
    static {
        totleNoOfBooks = 0;
    }
    {
        totleNoOfBooks++;
    }
    book(String isbn, String title, String author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }
    book(String isbn){
        this(isbn,"unknown","unknown");
    }
    static int getTotleNoOfBooks(){
        return totleNoOfBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed:");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book:");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("I hope you enjoyed, please leave a review:");
         }else{
            System.out.println("This book is already in the library:");
        }
    }
    public static void main(String[] args){
        book designOfThings = new book("1","Design", "Author");
        book myBook = new book("2");
        System.out.println(book.totleNoOfBooks);
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
