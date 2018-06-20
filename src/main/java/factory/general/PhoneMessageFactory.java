package factory.general;

/**
 * Created by kayle on 16/8/27.
 */
public class PhoneMessageFactory implements MessageFactory {
    public void sendMessage() {
        System.out.printf("发送数据。。。。。。");
    }

    public String getMessage() {
        return null;
    }
}
