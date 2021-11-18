package sender;

import facebook.FacebookUser;
import facebook.MyFacebookUser;
import org.junit.jupiter.api.Test;
import twitter.MyTwitterUser;
import twitter.TwitterUser;
import user.User;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    private FacebookUser facebookUser;
    private TwitterUser twitterUser;
    private User myTwitterUser;
    private User myFacebookUser;
    private MessageSender messageSender;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        String country = "Ukraine";
        String email = "user@gmail.com";
        Date lastActive = new Date(System.currentTimeMillis());
        facebookUser = new FacebookUser(email, country, lastActive);
        twitterUser = new TwitterUser(email, country, lastActive);
        myTwitterUser = new MyTwitterUser(twitterUser);
        myFacebookUser = new MyFacebookUser(facebookUser);
        messageSender = new MessageSender();
    }


    @Test
    void send() {
        assertTrue(messageSender.send("Hello", myFacebookUser, "Ukraine" ));
        assertTrue(messageSender.send("Hello", myTwitterUser, "Ukraine" ));
        assertFalse(messageSender.send("Hello", myFacebookUser, "Poland" ));
    }
}