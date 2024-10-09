
class Library{
String[] books;
int no_of_books;

Library(){
this.books = new String [100];
this.no_of_books = 0;
}

void addBook(String book) {
this.books[no_of_books] = book;
no_of_books++;
System.out.println(book+ " has been added!");
}

void showAvailableBooks (){
System.out.println("Available Books are:");
for (String book : this.books) {
if (book == null){
continue;
}
System.out.println("* " + book);}
}

void issueBook(String book){
    for(int i=0;i<this.books.length;i++){
        if(this.books[i].equals(book)){
            System.out.println("the book has been issued!");
            this.books[i]=null;
            return;
        }
    
    }
    System.out.println("this book doesn't exist");
}
void returnbook(String book){
   addBook(book);
}
}
public class Library_project{
    public static void main(String[] args) {
        Library centralLibrary=new Library();
        centralLibrary.addBook(("think and rich grow"));
        centralLibrary.addBook(("Algorithms"));
        centralLibrary.addBook("C++");
centralLibrary.showAvailableBooks();

centralLibrary.issueBook("C++");
centralLibrary.showAvailableBooks();
centralLibrary.returnbook("C++");
centralLibrary.showAvailableBooks();
    }
}
