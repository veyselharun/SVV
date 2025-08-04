package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class SubscriberOperationsTest {

    // Test valid user with Mockito
    @Test
    void watchVideoValidUser() {

        // Create mock object
        // loginServiceMock is the mock object
        LoginService loginServiceMock = mock(LoginService.class);
        // Without static import we would have written:
        // LoginService loginServiceMock = Mockito.mock(LoginService.class);

        // Set mock behavior
        // when(...).thenReturn(...) is the stubbing pattern
        // authorizeUser("ayse", "pass") is the stubbed method
        // when(...).thenReturn(...) is called when the mocked method is called
        when(loginServiceMock.authorizeUser("ayse", "pass")).thenReturn(true);

        // Create a new instance of the SubscriberOperations class.
        // Pass the mock loginServiceMock and the credentials "ayse" and "pass" to its constructor.
        // SubscriberOperations class can use it without calling the real LoginService.
        // This allows controlled testing of SubscriberOperations behavior based on the stubbed/mocked authorizeUser method.
        SubscriberOperations subscriberOperations = new SubscriberOperations(loginServiceMock, "ayse", "pass");

        // Call the method under test
        // This method will result in the call of loginServiceMock.authorizeUser("ayse", "pass")
        String result = subscriberOperations.watchVideo();

        // Verify that the method authorizeUser("ayse", "pass") was called
        // This verifies that the method authorizeUser("ayse", "pass") was called exactly once
        // This is used in behavior verification.
        // We are not checking what the method returns here, but rather whether it was called (and with what arguments).
        // Will return silently if the method was called with the given arguments.
        // Will throw an exception if the method was not called at all, or called with different arguments.
        // Mockito will throw an exception (specifically, a WantedButNotInvoked or ArgumentsAreDifferent exception),
        // and the test will fail.
        verify(loginServiceMock).authorizeUser("ayse", "pass");

        // Verify that the result is as expected
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