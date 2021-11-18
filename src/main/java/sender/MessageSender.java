package sender;

import user.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getCountry().equals(country) &&
                (System.currentTimeMillis() - user.getActiveTime().getTime() <= 3600000)) {
            System.out.printf("Messag \"%s\" sent to %s\n", text, user.getEmail());
            return true;
        }
        return false;
    }
}
