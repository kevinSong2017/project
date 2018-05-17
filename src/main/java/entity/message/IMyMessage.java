package entity.message;

import java.util.HashMap;
import java.util.Map;

public class IMyMessage {

    private Map<String,Object> messageParam=new HashMap<String, Object>();

    public Map<String, Object> getMessageParam() {
        return messageParam;
    }

    public void setMessageParam(Map<String, Object> messageParam) {
        this.messageParam = messageParam;
    }

    /**
     * 发送消息方法上
     */
    public  void  sendMessage(){
        System.out.println("this is IMyMessage sendMessage Method");
    };
}
