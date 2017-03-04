package ssm.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.MedicineDao;
import ssm.entity.Medicine;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MedicineServiceImpl implements MedicineService{
    @Resource
    private MedicineDao medicineDao;

    @Resource
    private MongoDBService mongoDBService;

    public int add(Medicine medicine) {
        return medicineDao.add(medicine);
    }

    public int deleteById(Long id) {
        return medicineDao.deleteById(id);
    }

    public Medicine getById(Long id) {
        return medicineDao.getById(id);
    }

    public List<Medicine> getSome(Integer page, Integer size) {
        return medicineDao.getSome((page-1)*size, size);
    }

    public List<Medicine> getAll() {
        return medicineDao.getAll();
    }

    public Integer countSuitableMedicines(String keyword, String forbidden) {
        return medicineDao.countSuitable(keyword, forbidden);
    }

    public List<Medicine> findSuitableMedicines(String keyword, String forbidden, Integer page, Integer size) {
        return medicineDao.findSuitable(keyword, forbidden, (page-1)*size, size);
    }

    public InputStream getImg(Long id) {
        return mongoDBService.getFileStream("ipicss", "medicineImg", id.toString());
    }
}
