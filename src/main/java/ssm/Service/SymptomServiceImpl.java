package ssm.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.SymptomDao;
import ssm.entity.Symptom;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SymptomServiceImpl implements SymptomService{
    @Resource
    private SymptomDao symptomDao;

    public int add(Symptom symptom) {
        return symptomDao.add(symptom) ;
    }

    public int deleteById(Long id) {
        return symptomDao.deleteById(id);
    }

    public Symptom getById(Long id) {
        return symptomDao.getById(id);
    }

    public List<Symptom> getAll() {
        return symptomDao.getAll();
    }
}
