package behavioral.chainofresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    private static AuthenticationProcessor getChainOfAuthProcessor() {

        AuthenticationProcessor oAuthProcessor = new OAuthAuthenticationProcessor(null);
        AuthenticationProcessor unamePasswordProcessor = new UsernamePasswordAuthenticationProcessor(oAuthProcessor);
        return unamePasswordProcessor;
    }

    @Test
    public void givenOAuthProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        boolean isAuthorized = authProcessorChain.isAuthorized(new OAuthTokenProvider());
        Assertions.assertTrue(isAuthorized);
    }

    @Test
    public void givenUsernamePasswordProvider_whenCheckingAuthorized_thenSuccess() {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        boolean isAuthorized = authProcessorChain.isAuthorized(new UsernamePasswordProvider());
        Assertions.assertTrue(isAuthorized);
    }
}
