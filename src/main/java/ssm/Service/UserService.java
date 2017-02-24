package ssm.Service;

import ssm.entity.User;

import java.util.List;

/**
 * Created by fy on 2017/2/24.
 */
public interface UserService {
    int add(User user);
    int deleteById(Long id);
    User getById(Long id);
    List<User> getAll();
}
