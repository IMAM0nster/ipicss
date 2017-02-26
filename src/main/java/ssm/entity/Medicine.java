package ssm.entity;

/**
 * Created by fy on 2017/2/26.
 */
public class Medicine {
    private Long id;
    private String name;
    private Long symptoms;
    private Long ingredients;
    private Float price;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(Long symptoms) {
        this.symptoms = symptoms;
    }
    public Long getIngredients() {
        return ingredients;
    }
    public void setIngredients(Long ingredients) {
        this.ingredients = ingredients;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
}
