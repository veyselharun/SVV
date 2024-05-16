package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class SubscriberOperationsTest {

    // Test valid user with Mockito
    @Test
    void watchVideoValidUser() {

        LoginService loginServiceMock = mock(LoginService.class);

        when(loginServiceMock.authorizeUser("ayse", "pass")).thenReturn(true);

        SubscriberOperations subscriberOperations = new SubscriberOperations(loginServiceMock, "ayse", "pass");

        String result = subscriberOperations.watchVideo();

        verify(loginServiceMock).authorizeUser("ayse", "pass");

        assertEquals("Watching video.", result);
    }


    // Test invalid user with Mockito
    @Test
    void watchVideoInvalidUser() {

        LoginService loginServiceMock = mock(LoginService.class);

        when(loginServiceMock.authorizeUser("ahmet", "pass")).thenReturn(false);

        SubscriberOperations subscriberOperations = new SubscriberOperations(loginServiceMock, "ahmet", "pass");

        String result = subscriberOperations.watchVideo();

        verify(loginServiceMock).authorizeUser("ahmet", "pass");

        assertEquals("You need to subscribe to the service to watch video.", result);
    }
}