
import ExerciseResolution.Model.ArrayIndexOutOfBoundsExceptionHandler;
import ExerciseResolution.Model.CreateIndexException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestClass {
    @Test
    public void testEnsureGoodHandlingException(){
        ArrayList<String> programmingLanguages = new ArrayList<String>(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Go", "Kotlin", "PHP", "Swift", "Ruby", "Rust", "TypeScript", "Scala", "Lua", "R"));
        CreateIndexException indExcep = new CreateIndexException();
            Exception exception = assertThrows(
                    ArrayIndexOutOfBoundsExceptionHandler.class,
                    () -> {
                        indExcep.exceptionMethod(programmingLanguages);

                    },"The Array has less positions than the ones you are trying to access, please reduce the number of the iterator to the less than the size of the array."
            );
    }
}


