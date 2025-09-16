package ExerciseResolution.Model;

import java.util.ArrayList;

public class CreateIndexException {
    public CreateIndexException(){};

    public void exceptionMethod(ArrayList<String> programmingLang) throws ArrayIndexOutOfBoundsExceptionHandler {
        int x;

        for(x=0;(x<=programmingLang.size()+1);x++){
               if(programmingLang.isEmpty() ){
                    System.out.println("The String you are putting is empty please try to pass the ArrayList with some strings");
                } else if (x >= programmingLang.size()) {
                    throw new ArrayIndexOutOfBoundsExceptionHandler("The Array has less positions than the ones you are trying to access, please reduce the number of the iterator to the less than the size of the array.");
                } else {
                    System.out.println(programmingLang.get(x));
                }
        }
    }
}
