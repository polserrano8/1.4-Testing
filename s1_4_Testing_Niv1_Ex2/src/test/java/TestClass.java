
import ExerciseResolution.Model.DniCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {


    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "46422175, X",
            "34567890, V",
            "45678901, G",
            "56789012, B",
            "67890123, B",
            "78901234, C",
            "89012345, B",
            "90123456, X",
            "11223344, S"
    })
    public void testGetLetterMethodinDniCalculation ( int dNi, String expected){
        DniCalculation calculator = new DniCalculation();
        calculator.setdNi(dNi);
        Assertions.assertEquals(expected,calculator.getLetterStr());
    }



}
