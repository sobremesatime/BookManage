package cn.jxufe.lyl.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisConnectionUtil {
    private static SqlSession mySession = null;

    static {
        try {
            InputStream stream = Resources.
                    getResourceAsStream("resources/mybatis-config.xml");
            SqlSessionFactory factory =
                    new SqlSessionFactoryBuilder().build(stream);
            mySession = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //该方法会获得mybatis核心操作对象SqlSession
    public static SqlSession getSqlSession() throws IOException {
        if (mySession == null) {
            InputStream stream = Resources.
                    getResourceAsStream("resources/mybatis-config.xml");
            SqlSessionFactory factory =
                    new SqlSessionFactoryBuilder().build(stream);
            mySession = factory.openSession();
        }
        return mySession;
    }
}
