package spring.boot.jdbc.mybatis.mvc.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spring.boot.jdbc.mybatis.dao.UserMapper;
import spring.boot.jdbc.mybatis.entity.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DaoApplication.class)
public class BoardInfoMapperTest {

    @Autowired
    private UserMapper userMapper;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Test
    public void testSelectAll() {
        List<User> list = userMapper.selectAll();
        System.out.println(list);
    }
}
