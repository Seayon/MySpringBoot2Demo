package com.saeyon.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.filter.OrderedHiddenHttpMethodFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/**
 * @BelongProjecet MySpringBoot2Demo
 * @BelongPackage com.saeyon.controller
 * @Copyright 2000-2021
 * @Author: SaeyonZhao
 * @Date: 2021/8/21 5:00 下午
 * @Version V1.0
 * @Description:
 */

@RestController
@RequestMapping("/rest")
public class RestTestController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(){
        return "POST-张三";
    }


    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }

    //
    // @Bean
    // @ConditionalOnMissingBean(HiddenHttpMethodFilter.class)
    // @ConditionalOnProperty(prefix = "spring.mvc.hiddenmethod.filter", name = "enabled", matchIfMissing = false)
    // public OrderedHiddenHttpMethodFilter hiddenHttpMethodFilter() {
    //     return new OrderedHiddenHttpMethodFilter();
    // }


    // //自定义filter
    // @Bean
    // public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
    //     HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
    //     methodFilter.setMethodParam("_m");
    //     return methodFilter;
    // }
}
