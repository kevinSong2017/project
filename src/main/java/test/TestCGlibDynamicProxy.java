package test;

import controller.proxy.Hello;
import controller.proxy.proxyimpl.HelloImpl;
import util.CGLibDynamicProxy;

public class TestCGlibDynamicProxy {
    public static void main(String[] args) {
        CGLibDynamicProxy cgLibDynamicProxy=new CGLibDynamicProxy();
        Hello hello=cgLibDynamicProxy.getProxy(HelloImpl.class);
        hello.sayHello();
    }
}
