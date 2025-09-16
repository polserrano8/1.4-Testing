package ExerciseResolution.Model;

public class DniCalculation {
    private int dNi;

    public DniCalculation(){}

    public void getLetter(){
        switch(this.dNi%23){
            case 0 -> System.out.println("T");
            case 1 -> System.out.println("R");
            case 2 -> System.out.println("W");
            case 3 -> System.out.println("A");
            case 4 -> System.out.println("G");
            case 5 -> System.out.println("M");
            case 6 -> System.out.println("Y");
            case 7 -> System.out.println("F");
            case 8 -> System.out.println("P");
            case 9 -> System.out.println("D");
            case 10 -> System.out.println("X");
            case 11 -> System.out.println("B");
            case 12 -> System.out.println("N");
            case 13 -> System.out.println("J");
            case 14 -> System.out.println("Z");
            case 15 -> System.out.println("S");
            case 16 -> System.out.println("Q");
            case 17 -> System.out.println("V");
            case 18 -> System.out.println("H");
            case 19 -> System.out.println("L");
            case 20 -> System.out.println("C");
            case 21 -> System.out.println("K");
            case 22 -> System.out.println("E");
        }
    }
    public String getLetterStr(){
        try{
        switch(this.dNi%23){
            case 0 -> {return "T";}
            case 1 ->{ return "R";}
            case 2 -> {  return "W";}
            case 3 -> {  return "A";}
            case 4 -> { return "G";}
            case 5 -> { return "M";}
            case 6 -> { return "Y";}
            case 7 -> { return "F";}
            case 8 -> { return "P";}
            case 9 -> { return "D";}
            case 10 -> { return "X";}
            case 11 -> { return "B";}
            case 12 -> { return "N";}
            case 13 -> { return "J";}
            case 14 -> { return "Z";}
            case 15 -> { return "S";}
            case 16 -> { return "Q";}
            case 17 -> { return "V";}
            case 18 -> { return "H";}
            case 19 -> { return "L";}
            case 20 -> { return "C";}
            case 21 -> { return "K";}
            case 22 -> { return "E";}
        }
    }catch(IllegalArgumentException e1) {
            System.out.println(e1.getMessage());
        }
        return "Incorrect format";
    }


    public int getdNi() {
        return dNi;
    }

    public void setdNi(int dNi2) {
        this.dNi = dNi2;
    }
}
