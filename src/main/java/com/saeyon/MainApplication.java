package com.saeyon;


import com.saeyon.bean.Pet;
import com.saeyon.bean.User;
import com.saeyon.config.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) },basePackages = {"com.saeyon"})
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        SpringConfig springConfig = run.getBean("springConfig", SpringConfig.class);
        System.out.println("springConfig = " + springConfig);
        Pet configPet = springConfig.pet();
        System.out.println(configPet);


        User myUser = run.getBean("myUser", User.class);
        User myUser1 = run.getBean("myUser", User.class);
        System.out.println("myUser == myUser1 = " + (myUser == myUser1));

        Pet pet = run.getBean("pet", Pet.class);
        Pet pet1 = myUser.getPet();
        System.out.println("pet == pet1 = " + (pet == pet1));
        System.out.println("configPet == pet1 = " + (configPet == pet1));




    }
}
