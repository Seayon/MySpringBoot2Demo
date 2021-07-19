package com.saeyon.config;

import com.saeyon.bean.Pet;
import com.saeyon.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false) // 告诉 springbootve这是一个配置类 == 配置文件
//proxyBeanMethods 默认是 true,full 模式,spring 会对这个配置类进行代理增强,后续有任何地方调用这个类的下面的获取 bean 的方法,都会返回容器中已经创建好的对象
//proxyBeanMethods 如果设置为 false,则为 Lite 模式,每次都会跳过检查直接调用,对这个类不进行增强
//但是 proxyBeanMethods 设置为 false,只是不增强 下面 myUser() 这个方法,用基于类型的 引入:比如下面的 myUser(Pet pet)还是会引入进来容器中已经存在的类
public class SpringConfig {

//    默认返回的是方法的名字
    @Bean
    public User myUser(Pet pet) {
        User zs = new User("张三", 18);
        zs.setPet(pet);
        return zs;
    }

    @Bean
    public Pet pet() {
        return new Pet("tomcat");
    }

}