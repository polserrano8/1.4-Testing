import ExerciseResolution.Model.Book;
import ExerciseResolution.Model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlphabeticalOrderNoDuplicatesTest {
    private Library library;
    @BeforeEach
    public void init(){
        this.library = new Library();
        Book supermanComic = new Book("SuperMan & Voldemort", 1);
        Book timeLoopMystery = new Book("The Time Loop Mystery", 2);
        Book cosmicGardener = new Book("The Cosmic Gardener", 3);
        Book neuralHeist = new Book("Neural Heist: Memories for Sale", 4);
        Book echoOfTomorrow = new Book("Echo of Tomorrow", 5);
        library.addBook(supermanComic,timeLoopMystery,cosmicGardener,neuralHeist,echoOfTomorrow);

    }
    @Test
    public void whenObjectInsertedEnsureListNotEmpty(){
         Assertions.assertFalse(library.returnList().isEmpty());

    }
    @Test
    public void whenObjectInsertedEnsureListSizeCorrect(){
         assertEquals(5,library.returnList().size());
    }
    @Test
    public void whenObjectInsertedEnsurePositionListCorrect(){
        library.bookInPosition(new Book("Don Quijote",4),3);
        assertEquals(3,library.bookIn("Don Quijote",3));
    }
    @Test
    public void givenDuplicatedBook_whenAdded_NoDuplicatedAccepted(){
        Book actualBook = new Book("Factfulness", "A book that shows the real world and it's better than we think" ,15);

        library.addBook(actualBook);

        assertEquals(6, library.returnList().size() , "We insert a book that we already have in the library and the number of books does not change.");

    };

    @Test
    public void getTitleCorrectly(){
        assertEquals("SuperMan & Voldemort",this.library.returnList().get(0).getTitle());
    };
    @Test
    public void ensureLessSizeArray(){
        int x = library.returnList().size();
        library.eraseBook("SuperMan & Voldemort");
        assertEquals(x-1,library.returnList().size());
    }
    @Test
    public void ensureABCOrdered(){
        library.returnList();

    }

}
