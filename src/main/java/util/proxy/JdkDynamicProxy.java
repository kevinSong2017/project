package util.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class JdkDynamicProxy implements InvocationHandler {


    private Object target;

    public JdkDynamicProxy(Object target) {
        this.target = target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object result=method.invoke(target,args);
        after();
        return result;
    }
    void  before(){
        System.out.println("before dynamic method");
    }
    void  after(){
        System.out.println("after dynamic method");
    }


}
