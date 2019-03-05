package com.chap07.main;

import com.chap07.spring.Calculator;
import com.chap07.config.AppCtx;
import com.chap07.spring.ImpeCalculator;
import com.chap07.spring.RecCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {

    private ImpeCalculator cal1;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppCtx.class);

        //Calculator cal = ctx.getBean("recCalculator", Calculator.class);
        RecCalculator cal = ctx.getBean("recCalculator", RecCalculator.class);

        long fiveFact = cal.factorial(5);
        System.out.println("cal.factorial(5) = " + fiveFact);
        System.out.println(cal.getClass().getName());
        ctx.close();
    }

}
