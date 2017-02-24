package ssm.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import ssm.entity.User;

import java.util.List;

/**
 * Created by fyyzyh on 2017/2/24.
 */
@Repository
public interface UserDao {

    public int add(User user);

    public int deleteById(@Param("id") Long id);

    //public int update(User user);

    public User getById(@Param("id") Long id);

    public List<User> getAll();
}
