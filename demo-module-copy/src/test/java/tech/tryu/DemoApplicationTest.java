package tech.tryu;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author tryu
 * @date 2022-12-16 16:41
 *
 * 注意：the @RunWith annotation has been replaced by the more powerful @ExtendWith annotation.
 * 1.基于 JUnit5 的运行环境，不需要额外加注解，默认运行在 JUnit5 环境中
 * 2.基于 Spring 框架融合的基于 @ContextConfiguration 配置的则：
 * @RunWith(SpringJUnit4ClassRunner.class) 被 @ExtendWith(SpringExtension.class) 取代
 *
 */

class DemoApplicationTest {
    private final static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Test
    void mainTest() {
        logger.info("springboot test");
    }
}