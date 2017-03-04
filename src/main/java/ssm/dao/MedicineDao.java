package ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import ssm.entity.Medicine;

import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
@Repository
public interface MedicineDao {
    public int add(Medicine medicine);

    public int deleteById(@Param("id") Long id);

    public int update(Medicine medicine);

    public Medicine getById(@Param("id") Long id);

    public List<Medicine> getSome(@Param("offset") Integer offset, @Param("size") Integer size);

    public List<Medicine> getAll();

    Integer countSuitable(@Param("keyword") String keyword, @Param("forbidden") String forbidden);

    public List<Medicine> findSuitable(@Param("keyword") String keyword, @Param("forbidden") String forbidden, @Param("offset") Integer offset, @Param("size") Integer size);
}
