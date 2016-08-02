package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import source.ErrorServlet;

import javax.servlet.ServletContext;

public class ContextListener implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {

        System.out.println("ContextListener : onStartup");

        try {
            ApplicationContext ctx =
                    new AnnotationConfigApplicationContext(SimpleContextConfiguration.class);

            ErrorClass errorClass = ctx.getBean(ErrorClass.class);
            errorClass.beanDefinition();
        } catch (Exception ex) {
            ApplicationContext ctx =
                    new AnnotationConfigApplicationContext(StubContextConfiguration.class);

            ErrorServlet.error = ex.getMessage();

        }
    }

}