package ssm.Service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ssm.Service.UserService;
import ssm.entity.User;

/**
 * Created by cx132 on 2017/3/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
@Transactional
public class UserServiceImplTest {
    private static Logger logger = Logger.getLogger(UserServiceImplTest.class);

    @Autowired
    UserService userService;
//    @Resource
//    private UserServiceImpl userService = null;

    @Test
    public void add() throws Exception {
        System.out.println("going to test add user");
        User user = new User();
        user.setUsername("Fyy");
        user.setPassword("123456");
        user.setMobile("110");
        user.setEmail("12345@qq.com");
        user.setType('p');
        userService.add(user);
        System.out.println("password of Fyy:" + userService.getByUsername("Fyy").getPassword());
    }

    @Test
    public void getAll() throws Exception {
//        User user = us.getById((long) 1);
    }
}
