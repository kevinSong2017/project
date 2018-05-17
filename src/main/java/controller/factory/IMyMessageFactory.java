package controller.factory;

import entity.message.IMyMessage;

public interface IMyMessageFactory {

    IMyMessage createMessage(String messageType);

}
