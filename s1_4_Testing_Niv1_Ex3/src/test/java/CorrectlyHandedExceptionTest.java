
import ExerciseResolution.Model.CreateIndexException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class CorrectlyHandedExceptionTest {
    @Test
    public void testEnsureGoodHandlingException(){
        CreateIndexException indExcep = new CreateIndexException();
            assertThrows(
                    ArrayIndexOutOfBoundsException.class,
                    () -> {
                        indExcep.exceptionMethod();

                    });
    }
}


