package ssm.Service;

import ssm.entity.Symptom;

import java.util.List;

/**
 * Created by fy on 2017/2/26.
 */
public interface SymptomService {
    public int add(Symptom symptom);
    public int deleteById(Long id);
    public Symptom getById(Long id);
    public List<Symptom> getAll();
}
