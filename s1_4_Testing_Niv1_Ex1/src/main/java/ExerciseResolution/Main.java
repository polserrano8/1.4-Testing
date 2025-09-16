package ExerciseResolution;

import ExerciseResolution.Model.Book;
import ExerciseResolution.Model.Library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book harryPotter = new Book("Harry Potter and the Phylosopher's Stone","First book of the legendary saga of harry potter and his live" , 20,"Fantasy");
        Book harryPotter2 = new Book("Harry Potter and the Chamber of Secrets","Second book of the legendary saga of harry potter and his live" , 22,"Fantasy");
        Book harryPotter3 = new Book("Harry Potter and the Prisoner of Azkhaban","Third book of the legendary saga of harry potter and his live" , 24,"Fantasy");
        Book harryPotter4  = new Book("Harry Potter and the Calix of fire","Fourth book of the legendary saga of harry potter and his live" , 25,"Fantasy");

        lib.addBook(harryPotter,harryPotter2,harryPotter3);
        System.out.println(lib.returnList());

        System.out.println(lib.titleOf(1));

        lib.bookInPosition(harryPotter4,2);
        System.out.println(lib.titleOf(2));

        lib.eraseBook("Harry Potter and the Calix of fire");
        System.out.println(lib.titleOf(2));

    }

}