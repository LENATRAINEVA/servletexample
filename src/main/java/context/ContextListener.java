package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import source.ErrorServlet;

import javax.servlet.ServletContext;

/**
 * Данный класс загружает спринговый контекст, в контесте возникает исключение, и загружается другой контекст
 */
public class ContextListener implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
        try {
            ApplicationContext ctx =
                    new AnnotationConfigApplicationContext(SimpleContextConfiguration.class);
            ErrorClass errorClass = ctx.getBean(ErrorClass.class);
            errorClass.beanDefinition();
        } catch (Exception ex) {
            new AnnotationConfigApplicationContext(StubContextConfiguration.class);
            ErrorServlet.error = ex;
        }
    }
}