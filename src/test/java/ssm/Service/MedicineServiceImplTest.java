package ssm.Service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ssm.entity.Medicine;

import java.util.List;

/**
 * Created by cx132 on 2017/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
@Transactional
public class MedicineServiceImplTest {
    private static Logger logger = Logger.getLogger(MedicineServiceImplTest.class);

    @Autowired
    MedicineService medicineService;

    @Test
    public void countSuitableMedicines() {
        String keyword = "药";
        String forbidden = "test";
        Integer n = medicineService.countSuitableMedicines(keyword, forbidden);
        System.out.println("total: " + n.toString());
    }

    @Test
    public void findSuitableMedicines() {
        String keyword = "口服液";
        String forbidden = "test";
        Integer page = 1;
        Integer size = 5;
        List<Medicine> suitbleMedicines = medicineService.findSuitableMedicines(keyword, forbidden, page, size);
        for (Medicine medicine : suitbleMedicines) {
            System.out.println("medicine name: " + medicine.getName() + "\tid: " + medicine.getId());
        }
    }

    @Test
    public void getSome() {
        Integer page = 1;
        Integer size = 5;
        List<Medicine> medicineList = medicineService.getSome(page, size);
        for (Medicine medicine : medicineList) {
            System.out.println("medicine name: " + medicine.getName() + "\tid: " + medicine.getId());
        }
    }
}
