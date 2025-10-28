package ExerciseResolution;

import ExerciseResolution.Model.CreateIndexException;



public class Main {
    public static void main(String[] args) {

        CreateIndexException indExcep = new CreateIndexException();
        try{ indExcep.exceptionMethod();}
        catch (ArrayIndexOutOfBoundsException e1) {
        System.out.println(e1.getMessage());
        }
    }
}