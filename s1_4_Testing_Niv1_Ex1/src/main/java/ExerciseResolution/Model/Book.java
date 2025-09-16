package ExerciseResolution.Model;

public class Book {

    private String title;
    private int iD;
    private String description;
    private double price;
    private String category;

    public Book(String title, int iD){
        this.title = title;
        this.iD = iD;
    };
    public Book(String title, String description){
        this.title = title;
        this.description = description;
    }
    public Book(String title, String description, int price){
        this.title = title;
        this.description = description;
        this.price = price;
    }
    public Book(String title, String description, int price, String category){
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



}
