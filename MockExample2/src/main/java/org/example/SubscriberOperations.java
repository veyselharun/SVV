package org.example;

public class SubscriberOperations {

    LoginService loginService;
    String userName;
    String password;
    
    public SubscriberOperations(LoginService loginService, String userName, String password) {
        this.loginService = loginService;
        this.userName = userName;
        this.password = password;
    }

    public boolean checkAuthorization() {
        return loginService.authorizeUser(userName, password);
    }

    public String watchVideo() {
        if (checkAuthorization()) {
            return "Watching video.";
        } else {
            return "You need to subscribe to the service to watch video.";
        }
    }

}
