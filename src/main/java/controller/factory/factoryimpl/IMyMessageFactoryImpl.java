package controller.factory.factoryimpl;

import controller.factory.IMyMessageFactory;
import entity.message.IMyMessage;
import entity.message.MyMessageEmail;
import entity.message.MyMessageOaTodo;
import entity.message.MyMessageSms;

import java.util.HashMap;
import java.util.Map;

public class IMyMessageFactoryImpl implements IMyMessageFactory {

    @Override
    public IMyMessage createMessage(String messageType) {

        /**
         * 这里的方式是：消费者知道自己想要什么产品；若生产某种商品完全由工厂决定，则这里不应该传入控制生产的参数
         */
        IMyMessage myMessage;

        Map<String,Object> messageParam=new HashMap<String, Object>();
        /**
         * 根据某些条件去选择究竟创建哪一个具体实现对象，条件可以传入， 也可以从其他途径获得。
         * sms
         */
        if ("SMS".equals(messageType)){
            myMessage=new MyMessageSms();
            messageParam.put("PhoneNum","123456789");
        }else if ("OA".equals(messageType)){
            myMessage=new MyMessageOaTodo();
            messageParam.put("OAUSERNAME","123456789");
        }else if ("Email".equals(messageType)){
            myMessage=new MyMessageEmail();
            messageParam.put("EMAIL", "test@test.com");
        }else {
            myMessage=new MyMessageEmail();
            messageParam.put("EMAIL", "test@test.com");
        }

        myMessage.setMessageParam(messageParam);


        return myMessage;
    }
}
