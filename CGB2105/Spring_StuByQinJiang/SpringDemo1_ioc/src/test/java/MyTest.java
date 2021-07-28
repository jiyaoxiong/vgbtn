import cn.tedu.dao.UserDaoImpl;
import cn.tedu.dao.UserDaoMysqlImpl;
import cn.tedu.service.UserService;
import cn.tedu.service.UserServiceImpl;
import org.junit.jupiter.api.Test;


public class MyTest {
    @Test
    public void test1(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
