package test.aop;

import controller.proxy.Hello;
import controller.proxy.proxyimpl.HelloImpl;
import util.proxy.CGLibDynamicProxy;

public class TestCGlibDynamicProxy {
    public static void main(String[] args) {
        /*CGLibDynamicProxy cgLibDynamicProxy=new CGLibDynamicProxy();
        Hello hello=cgLibDynamicProxy.getProxy(HelloImpl.class);
        hello.sayHello();*/
        Hello hello = CGLibDynamicProxy.getInstance().getProxy(HelloImpl.class);
        hello.sayHello();
    }
}
