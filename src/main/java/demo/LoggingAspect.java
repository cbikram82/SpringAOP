package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        System.out.println(jp.getArgs()[0].toString()); // JoinPoints to access Method signature and args values.
        System.out.println("I am a Before logger");
    }
    @After("execution(* demo.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("I am an After Logger");
    }
}
