import com.ynu.edu.entity.User;
import com.ynu.edu.mapper.UserMapper;
import com.ynu.edu.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @ClassName TestSession
 * @Description 测试获取user
 * @Author Echo-Nie
 * @Date 2025/1/17 13:46
 * @Version V1.0
 */
public class TestSession {
    @Test
    public void Test1(){
        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName("admin");
        System.out.println(user);
    }
}
