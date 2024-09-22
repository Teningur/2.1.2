import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println("Сравнение singleton бина: " +
                (bean == bean2));

        System.out.println("Адреса в памяти: " + bean + " и " + bean2);

        System.out.println();

        System.out.println("Сравнение prototype бина: " +
                (cat == cat2));

        System.out.println("Адреса в памяти: " + cat + " и " + cat2);
    }
}