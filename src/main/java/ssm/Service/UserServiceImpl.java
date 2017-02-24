package ssm.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.UserDao;
import ssm.entity.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fy on 2017/2/24.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public int add(User user) {
        return userDao.add(user);
    }

    public int deleteById(Long id) {
        return userDao.deleteById(id);
    }

    public User getById(Long id) {
        return userDao.getById(id);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }
}
