package behavioral.chainofresponsibility;

public class OAuthAuthenticationProcessor extends AuthenticationProcessor {

    public OAuthAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
        if (authenticationProvider instanceof OAuthTokenProvider) {
            return Boolean.TRUE;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authenticationProvider);
        } else {
            return Boolean.FALSE;
        }
    }
}
