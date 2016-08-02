package context;

/**
 * Данный класс необходим для эмуляции ситуации не загрузившегося контекста
 */
public class ErrorClass {

    public final static String successResult = "CONTEXT START";
    public final static String error_of_start_context = "ERROR_OF_START_CONTEXT";

    public void beanDefinition(){

        throw new NullPointerException(error_of_start_context);
        //System.out.println(successResult);

    }

}
