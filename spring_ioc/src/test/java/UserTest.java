import com.home.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/11/25 14:54
 */
public class UserTest {
    @Test
    public void UserTest(){
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();

    }
}
