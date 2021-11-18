package user;

import facebook.FacebookUser;
import facebook.MyFacebookUser;
import twitter.MyTwitterUser;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private FacebookUser facebookUser;
    private TwitterUser twitterUser;
    private User myTwitterUser;
    private User myFacebookUser;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        String country = "Ukraine";
        String email = "user@gmail.com";
        Date lastActive = new Date(System.currentTimeMillis());
        facebookUser = new FacebookUser(email, country, lastActive);
        twitterUser = new TwitterUser(email, country, lastActive);
        myTwitterUser = new MyTwitterUser(twitterUser);
        myFacebookUser = new MyFacebookUser(facebookUser);
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(facebookUser.getEmail(), myFacebookUser.getEmail());
        assertEquals(twitterUser.getUserMail(), myTwitterUser.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(facebookUser.getUserCountry(), myFacebookUser.getCountry());
        assertEquals(twitterUser.getCountry(), myTwitterUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getActiveTime() {
        assertEquals(facebookUser.getUserActiveTime(), myFacebookUser.getActiveTime());
        assertEquals(twitterUser.getLastActiveTime(), myTwitterUser.getActiveTime());
    }
}