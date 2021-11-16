package facebook;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor @Getter
public class FacebookUser {
    private String email;
    private String userCountry;
    private LocalDateTime userActiveTime;
}
