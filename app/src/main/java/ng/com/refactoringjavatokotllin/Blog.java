package ng.com.refactoringjavatokotllin;

/**
 * POJO class
 */
// TODO 1 (" Convert this POJO class to koltin data class")
public class Blog {
    private String title;
    private String description;
    private int image;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Blog(String title, String description, int image, int price) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
