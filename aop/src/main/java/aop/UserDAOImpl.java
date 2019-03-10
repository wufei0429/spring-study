package aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDAOImpl implements UserDAO {
    private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);

//    实现接口
    @Override
    public void insert() {
        logger.debug("开始进行插入操作");

    }
}
