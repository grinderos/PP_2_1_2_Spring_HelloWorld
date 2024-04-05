package ru.javamentor.javaCodeConfig2;

import org.springframework.context.annotation.*;
import ru.javamentor.Pet;

@Configuration
//@ComponentScan("ru.javamentor.javaCodeConfig")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person2 personBean(){
        return new Person2(catBean());
    }
}
