package Model;

/**
 * Created by ongor1 on 2/23/2018.
 */

public class ListItem {
    private String name;
    private String description;


    public ListItem(String name , String description,String rating){
        this.name = name;
        this.description= description;
        this.rating = rating;

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    private String rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
