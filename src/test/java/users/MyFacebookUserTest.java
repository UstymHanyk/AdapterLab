package users;

import facebook.FacebookUser;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class MyFacebookUserTest {
    public MyFacebookUser myFacebookUser;

    @BeforeEach
    void setUp() {
        myFacebookUser = new MyFacebookUser(new FacebookUser("facebook@gmail.com",
                "Ukraine", LocalDateTime.now()));
    }

    @Test
    void getEmail() {
        Assert.assertEquals(myFacebookUser.getEmail(), "facebook@gmail.com");
    }

    @Test
    void getCountry() {
        Assert.assertEquals(myFacebookUser.getCountry(), "Ukraine");
    }

    @Test
    void getLastActiveTime() {
        Assert.assertTrue(myFacebookUser.getLastActiveTime().isAfter(LocalDateTime.now().minusDays(100)));
    }


}