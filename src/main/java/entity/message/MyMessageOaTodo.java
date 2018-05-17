package entity.message;

public class MyMessageOaTodo extends  IMyMessage{

    @Override
    public void sendMessage() {
        if (null==getMessageParam()
                ||null==getMessageParam().get("OAUSERNAME")
                ||"".equals(getMessageParam().get("OAUSERNAME"))){
        }
        System.out.println("我是邮件：发通知给"+getMessageParam().get("OAUSERNAME"));
    }
}
