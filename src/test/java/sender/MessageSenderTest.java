package sender;

import facebook.FacebookUser;
import users.MyFacebookUser;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


class MessageSenderTest {
    public MessageSender messageSender;
    public MyFacebookUser myFacebookUser;

    @BeforeEach
    void setUp() {
        messageSender = new MessageSender();
        myFacebookUser = new MyFacebookUser(new FacebookUser("facebook@gmail.com", "UK", LocalDateTime.now()));
    }

    @Test
    void old_last_active_time_send() {
        myFacebookUser = new MyFacebookUser(new FacebookUser("facebook@gmail.com", "UK", LocalDateTime.now().minusDays(100)));
        Assert.assertFalse(messageSender.send("Message", myFacebookUser, "UK"));
    }

    @Test
    void wrong_country_send() {
        Assert.assertFalse(messageSender.send("Message", myFacebookUser, "Ukraine"));
    }
    @Test
    void successful_send() {
        Assert.assertTrue(messageSender.send("Message", myFacebookUser, "UK"));
    }
}