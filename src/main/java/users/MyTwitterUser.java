package users;

import java.time.LocalDateTime;

import twitter.TwitterUser;


public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    public String getEmail() {
        return twitterUser.getUserMail();
    }

    public String getCountry() {
        return twitterUser.getCountry();
    }

    public LocalDateTime getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }

}
