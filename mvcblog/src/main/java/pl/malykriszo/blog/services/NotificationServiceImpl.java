package pl.malykriszo.blog.services;

import org.springframework.beans.factory.annotation.Autowired;

import javax.management.Notification;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class NotificationServiceImpl implements NotificationService {

    public static final String NOTIFY_MSG_SASSION_KEY = "siteNotificationMessages";

    @Autowired
    private HttpSession httpSession;


    @Override
    public void addInfoMessage(String msg) {
        addNotificationMessage(NotificationMessageType.INFO, msg);
    }

    @Override
    public void addErrorMessage(String msg) {
        addNotificationMessage(NotificationMessageType.ERROR, msg);

    }

    private void addNotificationMessage(NotificationMessageType type, String msg) {

        List<NotificationMessage> notifiyMessages = (List<NotificationMessage>)
                httpSession.getAttribute(NOTIFY_MSG_SASSION_KEY);
        if (notifiyMessages == null) {
            notifiyMessages = new ArrayList<NotificationMessage>();
        }

        notifiyMessages.add(new NotificationMessage(type, msg));
        httpSession.setAttribute(NOTIFY_MSG_SASSION_KEY, notifiyMessages);
    }

    public enum NotificationMessageType {
        INFO,
        ERROR
    }

    public class NotificationMessage {
        NotificationMessageType type;
        String text;

        public NotificationMessage(NotificationMessageType type, String text) {
            this.type = type;
            this.text = text;
        }

        public NotificationMessageType getType() {
            return type;
        }

        public String getText() {
            return text;
        }

    }
}