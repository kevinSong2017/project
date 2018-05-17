package controller.proxy.proxyimpl;

import controller.proxy.Hello;

public class HelloImpl implements Hello {

    @Override
    public void sayHello() {
        System.out.println("This is sayHello()");
    }
}
