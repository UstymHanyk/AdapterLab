package users;

import java.time.LocalDateTime;

import facebook.FacebookUser;


public class MyFacebookUser implements User{
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getEmail() {
        return facebookUser.getEmail();
    }

    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    public LocalDateTime getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }

}
