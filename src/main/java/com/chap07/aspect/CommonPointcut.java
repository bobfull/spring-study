package com.chap07.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcut {

    @Pointcut("execution(public * com.chap07.spring..*(..))")
    public void commonTarget() {

    }
}
