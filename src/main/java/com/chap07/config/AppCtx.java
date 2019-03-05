package com.chap07.config;

import com.chap07.spring.Calculator;
import com.chap07.aspect.ExeTimeAspect;
import com.chap07.spring.ImpeCalculator;
import com.chap07.spring.RecCalculator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx {
    @Bean
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    }

    @Bean
    public Calculator recCalculator() {
        return new RecCalculator();
    }

    @Bean
    public Calculator impeCalculator() {
        return new ImpeCalculator();
    }
}
