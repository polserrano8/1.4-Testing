package ExerciseResolution.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Library {
    List<Book> bookCollection = new ArrayList<>();

    public Library(){}

    public void addBook(Book... books){
        this.bookCollection.addAll(Arrays.asList(books));
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

}


