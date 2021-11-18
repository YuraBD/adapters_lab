import facebook.FacebookUser;
import facebook.MyFacebookUser;
import sender.MessageSender;
import user.User;

import java.util.Date;

public class SenderMain {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        String country = "Ukraine";
        String email = "user@gmail.com";
        Date lastActive = new Date(millis);
        FacebookUser facebookUser = new FacebookUser(email, country, lastActive);
        User myFacebookUser = new MyFacebookUser(facebookUser);
        MessageSender messageSender = new MessageSender();
        messageSender.send("Hello", myFacebookUser, "Ukraine" );
    }
}
