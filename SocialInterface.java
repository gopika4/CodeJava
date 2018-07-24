interface SocialFeedReader
{
    public Message pollForNewMessage();
}
class Message
{
    int messageId;
    String messagessource;
    String messageType;
    String message;
    public int getMessageId() {
        return messageId;
    }
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    public String getMessagessource() {
        return messagessource;
    }
    public void setMessagessource(String messagessource) {
        this.messagessource = messagessource;
    }
    public String getMessageType() {
        return messageType;
    }
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
   
}
class TwitterFeedReader implements SocialFeedReader 
{

    @Override
    public Message pollForNewMessage() {
	Message m1=new Message();
	m1.setMessage("Hello");
	m1.setMessageId(101);
	m1.setMessagessource("Twitter");
	m1.setMessageType("Text");
	return m1;
    }
    
}
class FacebookReader implements SocialFeedReader 
{

    @Override
    public Message pollForNewMessage() {
	Message m1=new Message();
	m1.setMessage("Hi");
	m1.setMessageId(103);
	m1.setMessagessource("Facebook");
	m1.setMessageType("Voice");
	return m1;
    }
    
}
public class SocialInterface {

    public static void main(String[] args) {
	TwitterFeedReader tw=new TwitterFeedReader();
	Message m=tw.pollForNewMessage();
	System.out.println(m.getMessageId());
	System.out.println(m.getMessage());
	System.out.println(m.getMessagessource());
	System.out.println(m.getMessageType());
	FacebookReader f=new FacebookReader();
	Message m1=f.pollForNewMessage();
	System.out.println(m1.getMessageId());
	System.out.println(m1.getMessage());
	System.out.println(m1.getMessagessource());
	System.out.println(m1.getMessageType());
	

    }

}
