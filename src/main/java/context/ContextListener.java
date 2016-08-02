package context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;

public class ContextListener implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {

        System.out.println("ContextListener : onStartup");

        /*ServletRegistration.Dynamic registration = container.addServlet("dispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/example*//*");*/


        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SimpleContextConfiguration.class);

        ErrorClass errorClass = ctx.getBean(ErrorClass.class);
        errorClass.beanDefinition();
    }

}