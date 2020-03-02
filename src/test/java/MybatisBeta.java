import com.dawn.config.MybatisConfig;
import com.dawn.domain.User;
import com.dawn.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MybatisBeta {
    private static final Logger log = LoggerFactory.getLogger(MybatisBeta.class);

    private SqlSession sqlSession = MybatisConfig.openSession();
    private UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    /**
     * 模糊查询 1
     * @param
     */
    @Test
    public void selectLike(){
        User user = new User();
        user.setName("%张%");
        List<User> users = mapper.selectLike(user);
        log.info(users.toString());
        MybatisConfig.closeSqlSession(sqlSession);
    }

    /**
     * 模糊查询 2
     * @param
     */
    @Test
    public void selectLike2(){
        User user = new User();
        user.setName("张");
        List<User> users = mapper.selectLike(user);
        log.info(users.toString());
        MybatisConfig.closeSqlSession(sqlSession);
    }

    /**
     * 模糊查询 2
     * @param
     */
    @Test
    public void selectLike3(){
        User user = new User();
        user.setName("张");
        List<User> users = mapper.selectLike(user);
        log.info(users.toString());
        MybatisConfig.closeSqlSession(sqlSession);
    }







    // 源
    @Test
    public void main() {
        // UserDao dao = new UserDaoImpl();
        User user1 = new User("张三",12,"不错的小孩");
        User user2 = new User("张三",12,"不错的小孩");
        User user3 = new User("张三",12,"不错的小孩");
        // List<User> users = dao.selectAll();
        // List<User> users = mapper.selectAll();

        mapper.addParams("大大",18, "习大大");

        MybatisConfig.closeSqlSession(sqlSession);
        log.info("UserMapper类 --------> {}",UserMapper.class.getSimpleName());
        log.info("通过代理获取到的类 --------> {}",mapper.getClass().getSimpleName());
        // log.info(users.toString());

    }

}
