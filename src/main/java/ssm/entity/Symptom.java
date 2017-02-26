package ssm.entity;

/**
 * Created by fy on 2017/2/26.
 */
public class Symptom {
    private Long id;
    private String description;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
