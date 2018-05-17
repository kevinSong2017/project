package test;

import controller.proxy.Hello;
import controller.proxy.proxyimpl.HelloImpl;
import util.JdkDynamicProxy;

/**
 * 测试JDK的动态代理
 */
public class TestDynamicProxy {
    public static void main(String[] args)  {
        JdkDynamicProxy dynamicProxy=new JdkDynamicProxy(new HelloImpl());
        Hello hello = dynamicProxy.getProxy();
        hello.sayHello();
    }
}
