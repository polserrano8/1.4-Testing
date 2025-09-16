package ExerciseResolution.Model;
import java.lang.RuntimeException;
import java.io.Serializable;


public class ArrayIndexOutOfBoundsExceptionHandler extends RuntimeException implements Serializable{

    private String msg;
    private static final long serialVersionUID = 1L;

    public ArrayIndexOutOfBoundsExceptionHandler(String msg){
        super(msg);
        this.msg = msg;
        System.out.println(msg);
    }
    @Override
    public String toString() {
        return msg;
    }

}
