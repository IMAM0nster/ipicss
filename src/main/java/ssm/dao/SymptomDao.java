package ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ssm.entity.Symptom;

import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
@Repository
public interface SymptomDao {
    public int add(Symptom symptom);
    public int deleteById(@Param("id") Long id);
    public int update(Symptom symptom);
    public Symptom getById(@Param("id") Long id);
    public List<Symptom> getAll();
}
