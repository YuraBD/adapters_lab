package facebook;

import user.User;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser user;

    public MyFacebookUser(FacebookUser facebookUser) {
        user = facebookUser;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getActiveTime() {
        return user.getUserActiveTime();
    }
}
