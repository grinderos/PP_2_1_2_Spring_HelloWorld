import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        bean1.setMessage("Goodbye, America");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage() + "\n");

        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        cat1.setName("Meison");
        System.out.println(cat1.getName());

        Cat cat2 = (Cat) applicationContext.getBean("catBean");
        cat2.setName("Shiro");
        System.out.println(cat2.getName() + "\n");


        System.out.println(bean1 == bean2);
        System.out.println(cat1 == cat2);

    }
}