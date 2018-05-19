package test.proxy;

import controller.proxy.Hello;
import controller.proxy.proxyimpl.HelloImpl;
import org.springframework.aop.framework.ProxyFactory;
import util.aopUtil.GreetAfterAdvice;
import util.aopUtil.GreetingAroundAdvice;
import util.aopUtil.GreetingBeforeAdvice;

public class TestAopClient {

    public static void main(String[] args) {
        /**
         * 創建代理工廠
         */
        ProxyFactory proxyFactory = new ProxyFactory();
        /**
         * 射入目標類對象
         */
        proxyFactory.setTarget(new HelloImpl());
        /**
         * 添加前置增強
         */
        proxyFactory.addAdvice(new GreetAfterAdvice());
        /**
         * 添加後置增強
         */
        proxyFactory.addAdvice(new GreetingBeforeAdvice());
        /**
         * 添加環繞增
         */
        proxyFactory.addAdvice(new GreetingAroundAdvice());
        /**
         * 從代理類方法中獲取代理
         */
        Hello hello = (Hello) proxyFactory.getProxy();
        /**
         * 調用代理方法
         */
        hello.sayHello();

    }
}
