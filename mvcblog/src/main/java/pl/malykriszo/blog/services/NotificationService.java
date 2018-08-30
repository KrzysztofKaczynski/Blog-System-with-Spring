package pl.malykriszo.blog.services;

import org.springframework.stereotype.Service;

@Service
public interface NotificationService {

    void addInfoMessage(String msg);
    void addErrorMessage(String msg);

}
