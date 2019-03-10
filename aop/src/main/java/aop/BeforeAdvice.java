package aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);
    public  void beforeMethod(){
        logger.debug("连接数据库操作.....");

    }
}
