package ssm.Service;

import ssm.entity.Ingredient;

import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
public interface IngredientService {
    public int add(Ingredient ingredient);
    public int deleteById(Long id);
    public Ingredient getById(Long id);
    public List<Ingredient> getAll();
}
