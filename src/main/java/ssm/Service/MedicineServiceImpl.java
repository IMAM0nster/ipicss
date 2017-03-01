package ssm.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.MedicineDao;
import ssm.dao.MongoDBDao;
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

    public List<Medicine> getAll() {
        return medicineDao.getAll();
    }

    public List<Medicine> findSuitableMedicines(String keyword, String forbidden, Integer page) {
        return medicineDao.findSuitable(keyword, forbidden, page);
    }

    public InputStream getImg(Long id) {
        return mongoDBService.getFileStream("ipicss", "medicineImg", id.toString());
    }
}
