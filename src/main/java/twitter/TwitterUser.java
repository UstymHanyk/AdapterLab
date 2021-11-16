package twitter;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor @Getter
public class TwitterUser {
    private String userMail;
    private String country;
    private LocalDateTime lastActiveTime;
}
