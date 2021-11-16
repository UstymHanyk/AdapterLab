package users;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.time.LocalDateTime;


class MyTwitterUserTest {
    public MyTwitterUser myTwitterUser;

    @BeforeEach
    void setUp() {
        myTwitterUser = new MyTwitterUser(new TwitterUser("twitter@gmail.com", "UK", LocalDateTime.now()));
    }

    @Test
    void getEmail() {
        Assert.assertEquals(myTwitterUser.getEmail(), "twitter@gmail.com");
    }

    @Test
    void getCountry() {
        Assert.assertEquals(myTwitterUser.getCountry(), "UK");
    }

    @Test
    void getLastActiveTime() {
        Assert.assertTrue(myTwitterUser.getLastActiveTime().isAfter(LocalDateTime.now().minusDays(100)));
    }
}