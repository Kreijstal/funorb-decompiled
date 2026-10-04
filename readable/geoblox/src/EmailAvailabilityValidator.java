/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityValidator extends TextInputValidator {
    private String cachedEmailCandidate;
    static AsyncResourceDownloader countryListDownloader;
    static int sessionServerNumber;
    private boolean cachedEmailAvailable;
    private MatchingTextValidator emailMatchValidator;
    static int[] remainingThemeReleaseTextColors;

    EmailAvailabilityValidator(TextInputWidget confirmationInput, TextInputWidget primaryEmailInput) {
        super(confirmationInput);
        this.cachedEmailCandidate = "";
        this.cachedEmailAvailable = false;
        try {
            this.emailMatchValidator = new MatchingTextValidator(confirmationInput, primaryEmailInput);
        } catch (RuntimeException emailAvailabilityConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) emailAvailabilityConstructionFailure), "mk.<init>(" + (confirmationInput != null ? "{...}" : "null") + ',' + (primaryEmailInput != null ? "{...}" : "null") + ')');
        }
    }

    final static void completeActiveEmailAvailabilityQuery(int methodGuard, boolean available) {
        if (methodGuard >= 0) {
            EmailAvailabilityValidator.completeActiveEmailAvailabilityQuery(83, true);
            EntityContactSupport.activeEmailAvailabilityQuery.complete((byte) -110, available);
            return;
        }
        EntityContactSupport.activeEmailAvailabilityQuery.complete((byte) -110, available);
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        EmailAvailabilityQuery availabilityQuery = null;
        RuntimeException stateFailureForContext = null;
        ValidationState mismatchedEmailState = null;
        ValidationState pendingEmailState = null;
        ValidationState availabilityState = null;
        RuntimeException stateFailureBeforeContext = null;
        StringBuilder stateMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtStateFailure = null;
        try {
          if (this.emailMatchValidator.validationStateForText(guard, candidateText) == WidgetSkinState.invalidInputValidationState) {
            mismatchedEmailState = WidgetSkinState.invalidInputValidationState;
            return mismatchedEmailState;
          }
          if (!candidateText.equals(this.cachedEmailCandidate)) {
            availabilityQuery = SoundSampleCache.getOrRefreshEmailAvailabilityQuery(-1, candidateText);
            if (!availabilityQuery.isCompleted(-76)) {
              pendingEmailState = WidgetSkinState.pendingQueryValidationState;
              return pendingEmailState;
            }
            this.cachedEmailCandidate = candidateText;
            this.cachedEmailAvailable = availabilityQuery.isAvailable((byte) -52);
          }
          if (!this.cachedEmailAvailable) {
            availabilityState = WidgetSkinState.invalidInputValidationState;
          } else {
            availabilityState = SocketArchiveNetworkClient.validInputValidationState;
          }
          return availabilityState;
        } catch (java.lang.RuntimeException emailAvailabilityStateFailure) {
          caughtStateFailure = emailAvailabilityStateFailure;
          stateFailureForContext = caughtStateFailure;
          stateFailureBeforeContext = stateFailureForContext;
          stateMessagePrefix = new StringBuilder().append("mk.D(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stateFailureBeforeContext), ((StringBuilder) (Object) stateMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException messageFailureForContext = null;
        String matchingErrorMessage = null;
        String unavailableEmailMessage = null;
        RuntimeException messageFailureBeforeContext = null;
        StringBuilder messagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtMessageFailure = null;
        try {
          if (guard != 422) {
            EmailAvailabilityValidator.releaseEmailAvailabilitySharedResources((byte) -50);
          }
          if (this.emailMatchValidator.validationStateForText(-257, candidateText) == WidgetSkinState.invalidInputValidationState) {
            matchingErrorMessage = this.emailMatchValidator.validationMessageForText(422, candidateText);
            return matchingErrorMessage;
          }
          if (this.validationStateForText(-257, candidateText) != WidgetSkinState.invalidInputValidationState) {
            return ClientOptionSupport.createEmailValidText;
          }
          unavailableEmailMessage = PasswordValidator.createEmailUnavailableAlertText;
          return unavailableEmailMessage;
        } catch (java.lang.RuntimeException emailAvailabilityMessageFailure) {
          caughtMessageFailure = emailAvailabilityMessageFailure;
          messageFailureForContext = caughtMessageFailure;
          messageFailureBeforeContext = messageFailureForContext;
          messagePrefix = new StringBuilder().append("mk.A(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageFailureBeforeContext), ((StringBuilder) (Object) messagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    public static void releaseEmailAvailabilitySharedResources(byte methodGuard) {
        remainingThemeReleaseTextColors = null;
        countryListDownloader = null;
        if (methodGuard != -9) {
            remainingThemeReleaseTextColors = (int[]) null;
        }
    }

    final static SocketConnector createProxySocketConnector(int methodGuard, String host, int port) {
        int guardResidue = 0;
        RuntimeException connectorFailureForContext = null;
        ProxySocketConnector proxyConnector = null;
        ProxySocketConnector connectorBeforeReturn = null;
        RuntimeException connectorFailureBeforeContext = null;
        StringBuilder connectorMessagePrefix = null;
        String hostDescription = null;
        RuntimeException caughtConnectorFailure = null;
        try {
          guardResidue = 111 % ((methodGuard - 9) / 38);
          proxyConnector = new ProxySocketConnector();
          ((SocketConnector) ((Object) proxyConnector)).destinationPort = port;
          ((SocketConnector) ((Object) proxyConnector)).destinationHost = host;
          connectorBeforeReturn = proxyConnector;
          return (SocketConnector) ((Object) connectorBeforeReturn);
        } catch (java.lang.RuntimeException proxyConnectorConstructionFailure) {
          caughtConnectorFailure = proxyConnectorConstructionFailure;
          connectorFailureForContext = caughtConnectorFailure;
          connectorFailureBeforeContext = connectorFailureForContext;
          connectorMessagePrefix = new StringBuilder().append("mk.B(").append(methodGuard).append(',');
          if (host == null) {
            hostDescription = "null";
          } else {
            hostDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) connectorFailureBeforeContext), ((StringBuilder) (Object) connectorMessagePrefix).append(hostDescription).append(',').append(port).append(')').toString());
        }
    }

    static {
        remainingThemeReleaseTextColors = new int[]{16407324, 16429852, 11199532, 9487646, 15149096};
    }
}
