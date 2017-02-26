package ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ssm.entity.Ingredient;

import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
@Repository
public interface IngredientDao {
    public int add(Ingredient ingredient);
    public int deleteById(@Param("id") Long id);
    public int update(Ingredient ingredient);
    public Ingredient getById(@Param("id") Long id);
    public List<Ingredient> getAll();
}
