package ExerciseResolution.Model;

import java.util.*;

public class Library {
    List<Book> bookCollection = new ArrayList<>();

    public Library(){}

    public void addBook(Book... books){
        if(!bookCollection.contains(books)){
        this.bookCollection.addAll(Arrays.asList(books));
        }
        sortBooks();
    }
    public List<Book> returnList(){
        return Collections.unmodifiableList(this.bookCollection);
    }
    public String titleOf(int position){
        return this.bookCollection.get(position).getTitle();
    }
    public void bookInPosition(Book book, int position){
        this.bookCollection.add(position,book);
    }
    public int bookIn(String title, int position) {
        int x = 0;
        for (x = 0; x < this.bookCollection.size(); x++) {
            if (this.bookCollection.get(x).getTitle().equals(title)) {
                return x;
            }
        }
        return -1;
    }

    public void eraseBook (String title){
        int x = 0;
        for (x = 0; x < this.bookCollection.size(); x++) {
            if (this.bookCollection.get(x).getTitle().equals(title)) {
                this.bookCollection.remove(x);
            }
        }
    }
    private void sortBooks() {
        bookCollection.sort(Comparator.comparing(Book::getTitle));
    }

}


