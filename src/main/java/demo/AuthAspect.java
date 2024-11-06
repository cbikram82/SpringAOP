package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {
    @Pointcut("within(demo..*)")
    public void authenticatePointCut() {
        System.out.println("User is Authenticated");
    }
    @Pointcut("within(demo..*)")
    public void authorisePointCut() {
        System.out.println("User is Authorized");
    }
    @Before("authenticatePointCut() && authorisePointCut()")
    public void authorise() {
        System.out.println("Authorizing user....");
    }

}
