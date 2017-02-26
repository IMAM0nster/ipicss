package ssm.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.IngredientDao;
import ssm.entity.Ingredient;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IngredientServiceImpl implements IngredientService{
    @Resource
    private IngredientDao ingredientDao;
    public int add(Ingredient ingredient) {
        return ingredientDao.add(ingredient);
    }

    public int deleteById(Long id) {
        return ingredientDao.deleteById(id);
    }

    public Ingredient getById(Long id) {
        return ingredientDao.getById(id);
    }

    public List<Ingredient> getAll() {
        return ingredientDao.getAll();
    }
}
