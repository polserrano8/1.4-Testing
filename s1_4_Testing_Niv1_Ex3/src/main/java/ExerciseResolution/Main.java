package ExerciseResolution;

import ExerciseResolution.Model.ArrayIndexOutOfBoundsExceptionHandler;
import ExerciseResolution.Model.CreateIndexException;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<String>(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Go", "Kotlin", "PHP", "Swift", "Ruby", "Rust", "TypeScript", "Scala", "Lua", "R"));
        CreateIndexException indExcep = new CreateIndexException();
       try{ indExcep.exceptionMethod(programmingLanguages);

    } catch (ArrayIndexOutOfBoundsExceptionHandler e1) {
        System.out.println(e1.getMessage());
    }
    }
}