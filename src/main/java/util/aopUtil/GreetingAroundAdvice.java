package util.aopUtil;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 環繞增強
 */
public class GreetingAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        before();
        Object result=methodInvocation.proceed();
        after();
        return result;

    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }

}
