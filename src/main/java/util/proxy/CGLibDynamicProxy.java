package util.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 方法级别的代理
 */
public class CGLibDynamicProxy implements MethodInterceptor {

    private static CGLibDynamicProxy cgLibDynamicProxy= new CGLibDynamicProxy();

    public CGLibDynamicProxy() {
    }

    public static  CGLibDynamicProxy getInstance(){
        return  cgLibDynamicProxy;
    }



    public <T> T getProxy(Class clz){
        return (T)Enhancer.create(clz,this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result=methodProxy.invokeSuper(o,objects);
        after();
        return result;
    }
    public void before(){
        System.out.println(" before CGlib dynamic mehtod");
    }
    public void after(){
        System.out.println(" after CGlib dynamic method");
    }
}
