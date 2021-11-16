import facebook.FacebookUser;
import twitter.TwitterUser;
import users.MyFacebookUser;
import users.MyTwitterUser;
import sender.MessageSender;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();

        MyFacebookUser myFacebookUser  = new MyFacebookUser( new FacebookUser("facebook@gmail.com", "UK",  LocalDateTime.now()));
        MyTwitterUser myTwitterUser = new MyTwitterUser( new TwitterUser("twitter@gmail.com", "Ukraine",  LocalDateTime.now()));

        MyFacebookUser myLateFacebookUser  = new MyFacebookUser( new FacebookUser("one_day_old_facebook@gmail.com", "UK",  LocalDateTime.now().minusYears(100)));

        messageSender.send("Facebook message", myFacebookUser, "UK");
        System.out.println("\n");
        messageSender.send("Twitter message", myTwitterUser, "UK");
        System.out.println("\n");
        messageSender.send("Facebook message to the one day old use", myLateFacebookUser, "UK");


    }
}
