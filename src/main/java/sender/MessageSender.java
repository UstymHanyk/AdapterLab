package sender;

import users.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        //send only if the country matches and the user was online within the last hour
        if ((user.getCountry() == country) & (user.getLastActiveTime().plusHours(1).isAfter(LocalDateTime.now()))) {
            System.out.println("'"+text+"' was sent to " + user.getEmail() + ", who lives in " +
                    user.getCountry() + " and was online on " +
                    user.getLastActiveTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            return true;
        }
        else{
            System.out.println("'"+text+"' was NOT sent to " + user.getEmail() + ", who lives in " +
                    user.getCountry() + " and was online on " +
                    user.getLastActiveTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                    ". \nThe account" +
                    " does not match the desired criteria(online within the past hour and country == "+country+")");
            return false;
        }
    }
}
