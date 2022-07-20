package cn.jxufe.lyl.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextUtil {
    private static ApplicationContext context = null;

    public static ApplicationContext getContext() {
        if (context == null) {
            context = new ClassPathXmlApplicationContext(
                    "/resources/spring-context.xml");
        }
        return context;
    }
    public static void closeContext() {
        if (context != null) {
            ((ConfigurableApplicationContext)context).close();
            context = null;
        }
    }
}
