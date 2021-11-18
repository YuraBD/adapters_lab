package twitter;

import user.User;

import java.util.Date;

public class MyTwitterUser implements User {
    private TwitterUser user;

    public MyTwitterUser(TwitterUser twitterUser) {
        user = twitterUser;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public Date getActiveTime() {
        return user.getLastActiveTime();
    }
}
