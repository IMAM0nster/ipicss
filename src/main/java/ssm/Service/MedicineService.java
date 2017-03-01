package ssm.Service;

import ssm.entity.Medicine;

import java.io.InputStream;
import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
public interface MedicineService {
    int add(Medicine medicine);
    int deleteById(Long id);
    Medicine getById(Long id);
    List<Medicine> getAll();
    List<Medicine> findSuitableMedicines(String keyword, String forbidden, Integer page);
    InputStream getImg(Long id);
}
