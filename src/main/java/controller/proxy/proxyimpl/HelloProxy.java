package controller.proxy.proxyimpl;

import controller.proxy.Hello;

public class HelloProxy implements Hello {

    private Hello hello=new HelloImpl();


    @Override
    public void sayHello() {
        before();
        hello.sayHello();
        after();
    }

    public void  before(){
        System.out.println("before method");
    }

    public void  after(){
        System.out.println("after method");
    }

    public static void main(String[] args) {
        Hello hello=new HelloProxy();
        hello.sayHello();
    }

}
