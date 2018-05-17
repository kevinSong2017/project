package entity.message;

public class MyMessageEmail extends IMyMessage {

    @Override
    public void sendMessage() {
        if (null==getMessageParam()
                ||null==getMessageParam().get("Email")
                ||"".equals(getMessageParam().get("Email"))){
        }
        System.out.println("我是邮件：发通知给"+getMessageParam().get("Email"));
    }

}
