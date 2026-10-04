/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextInputValidator {
    static int avatarCryFrameCursor;
    static String createEmailUnavailableAlertText;
    private TextInputWidget usernameInput;
    static String serviceUnavailableText;
    static Sprite countBoxSprite;
    private TextInputWidget emailInput;

    PasswordValidator(TextInputWidget passwordInput, TextInputWidget usernameInput, TextInputWidget emailInput) {
        super(passwordInput);
        try {
            this.emailInput = emailInput;
            this.usernameInput = usernameInput;
        } catch (RuntimeException validatorConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validatorConstructionFailure), "g.<init>(" + (passwordInput != null ? "{...}" : "null") + ',' + (usernameInput != null ? "{...}" : "null") + ',' + (emailInput != null ? "{...}" : "null") + ')');
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException validationFailureForContext = null;
        String lowercaseCandidate = null;
        String lowercaseCandidateForChecks = null;
        String lowercaseUsername = null;
        Object nullMessageForEmptyPassword = null;
        String lengthAlertBeforeReturn = null;
        String characterAlertBeforeReturn = null;
        String repeatedCharacterAlertBeforeReturn = null;
        String emailPartAlertBeforeReturn = null;
        String validMessageWithoutUsername = null;
        String usernameAlertBeforeReturn = null;
        String partialUsernameAlertBeforeReturn = null;
        String finalUsernameAlertBeforeReturn = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtValidationFailure = null;
        try {
          lowercaseUsername = this.usernameInput.widgetText.toLowerCase();
          lowercaseCandidate = candidateText.toLowerCase();
          if (lowercaseCandidate.length() == 0) {
            nullMessageForEmptyPassword = null;
            return (String) (nullMessageForEmptyPassword);
          }
          lowercaseCandidateForChecks = lowercaseCandidate;
          if (ArchiveCatalog.isPasswordLengthInvalid(lowercaseCandidateForChecks, guard - 344)) {
            lengthAlertBeforeReturn = ArchiveNetworkClient.createPasswordLengthAlertText;
            return lengthAlertBeforeReturn;
          }
          if (TextValidationSupport.containsNonAsciiAlphanumeric(lowercaseCandidateForChecks, (byte) -120)) {
            characterAlertBeforeReturn = ScoreSubmission.createPasswordCharacterAlertText;
            return characterAlertBeforeReturn;
          }
          if (SecondaryNodeDeque.hasUniformCharacters(guard + 18303, lowercaseCandidateForChecks)) {
            repeatedCharacterAlertBeforeReturn = NameCharacterSupport.createRepeatedPasswordAlertText;
            return repeatedCharacterAlertBeforeReturn;
          }
          if (guard != 422) {
            PasswordValidator.releasePasswordValidatorSharedResources(119);
          }
          if (this.passwordContainsEmailPart(candidateText, -29267)) {
            emailPartAlertBeforeReturn = DiskCacheWorker.createPasswordContainsEmailAlertText;
            return emailPartAlertBeforeReturn;
          }
          if (0 >= lowercaseUsername.length()) {
            validMessageWithoutUsername = ArchiveLoadStep.createPasswordValidText;
            return validMessageWithoutUsername;
          }
          if (TextValidationSupport.containsTextOrReverse(lowercaseCandidateForChecks, lowercaseUsername, -98)) {
            usernameAlertBeforeReturn = EntityCollisionSupport.createPasswordContainsNameAlertText;
            return usernameAlertBeforeReturn;
          }
          if (UsernameAvailabilityValidator.usernameContainsPasswordOrReverse(8, lowercaseUsername, lowercaseCandidateForChecks)) {
            partialUsernameAlertBeforeReturn = NameCharacterSupport.createPasswordContainsPartialNameAlertText;
            return partialUsernameAlertBeforeReturn;
          }
          if (!CrcAcknowledgedPacket.containsAccountNameOrReverse(lowercaseCandidateForChecks, lowercaseUsername, (byte) -96)) {
            return ArchiveNetworkClient.createPasswordLengthAlertText;
          }
          finalUsernameAlertBeforeReturn = EntityCollisionSupport.createPasswordContainsNameAlertText;
          return finalUsernameAlertBeforeReturn;
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("g.A(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    private final boolean passwordContainsEmailPart(String candidatePassword, int methodGuard) {
        String lowercaseEmail = null;
        RuntimeException emailCheckFailureForContext = null;
        String lowercasePassword = null;
        int lastAtSignIndex = 0;
        String emailLocalPart = null;
        String emailDomain = null;
        RuntimeException emailCheckFailureBeforeDescription = null;
        StringBuilder emailCheckMessagePrefix = null;
        String passwordDescription = null;
        RuntimeException caughtEmailCheckFailure = null;
        try {
          lowercaseEmail = this.emailInput.widgetText.toLowerCase();
          lowercasePassword = candidatePassword.toLowerCase();
          if ((0 < lowercaseEmail.length()) &&
              (lowercasePassword.length() > 0)) {
            lastAtSignIndex = lowercaseEmail.lastIndexOf("@");
            if ((0 <= lastAtSignIndex) &&
                (lowercaseEmail.length() - 1 > lastAtSignIndex)) {
              emailLocalPart = lowercaseEmail.substring(0, lastAtSignIndex);
              emailDomain = lowercaseEmail.substring(lastAtSignIndex + 1);
              if (lowercasePassword.indexOf(emailLocalPart) >= 0) {
                return true;
              }
              if (lowercasePassword.indexOf(emailDomain) >= 0) {
                return true;
              }
            }
          }
          if (methodGuard == -29267) {
            return false;
          }
          serviceUnavailableText = (String) null;
          return false;
        } catch (java.lang.RuntimeException emailCheckFailure) {
          caughtEmailCheckFailure = emailCheckFailure;
          emailCheckFailureForContext = caughtEmailCheckFailure;
          emailCheckFailureBeforeDescription = emailCheckFailureForContext;
          emailCheckMessagePrefix = new StringBuilder().append("g.B(");
          if (candidatePassword == null) {
            passwordDescription = "null";
          } else {
            passwordDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) emailCheckFailureBeforeDescription), ((StringBuilder) (Object) emailCheckMessagePrefix).append(passwordDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        String lowercaseUsername = null;
        RuntimeException stateFailureForContext = null;
        String lowercaseCandidate = null;
        ValidationState emptyPasswordStateBeforeReturn = null;
        ValidationState rejectedPasswordStateBeforeReturn = null;
        ValidationState emailPartStateBeforeReturn = null;
        ValidationState acceptedPasswordStateBeforeReturn = null;
        RuntimeException stateFailureBeforeDescription = null;
        StringBuilder stateMessagePrefix = null;
        String candidateDescription = null;
        RuntimeException caughtStateFailure = null;
        try {
          if (guard != -257) {
            this.usernameInput = (TextInputWidget) null;
          }
          lowercaseUsername = this.usernameInput.widgetText.toLowerCase();
          lowercaseCandidate = candidateText.toLowerCase();
          if (lowercaseCandidate.length() == 0) {
            emptyPasswordStateBeforeReturn = WidgetSkinState.invalidInputValidationState;
            return emptyPasswordStateBeforeReturn;
          }
          if (!FadingDialog.isPasswordAcceptableForUsername(lowercaseCandidate, lowercaseUsername, -25321)) {
            rejectedPasswordStateBeforeReturn = WidgetSkinState.invalidInputValidationState;
            return rejectedPasswordStateBeforeReturn;
          }
          if (!this.passwordContainsEmailPart(candidateText, -29267)) {
            acceptedPasswordStateBeforeReturn = SocketArchiveNetworkClient.validInputValidationState;
            return acceptedPasswordStateBeforeReturn;
          }
          emailPartStateBeforeReturn = WidgetSkinState.invalidInputValidationState;
          return emailPartStateBeforeReturn;
        } catch (java.lang.RuntimeException stateFailure) {
          caughtStateFailure = stateFailure;
          stateFailureForContext = caughtStateFailure;
          stateFailureBeforeDescription = stateFailureForContext;
          stateMessagePrefix = new StringBuilder().append("g.D(").append(guard).append(',');
          if (candidateText == null) {
            candidateDescription = "null";
          } else {
            candidateDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stateFailureBeforeDescription), ((StringBuilder) (Object) stateMessagePrefix).append(candidateDescription).append(')').toString());
        }
    }

    public static void releasePasswordValidatorSharedResources(int methodGuard) {
        if (methodGuard >= -90) {
            return;
        }
        countBoxSprite = null;
        createEmailUnavailableAlertText = null;
        serviceUnavailableText = null;
    }

    static {
        createEmailUnavailableAlertText = "Email address is unavailable";
        serviceUnavailableText = "Service unavailable";
        avatarCryFrameCursor = 0;
    }
}
