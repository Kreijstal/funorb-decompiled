/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationDialog extends MessageDialog implements ButtonActivationListener {
    private AccountCreationForm accountForm;
    private boolean accountIneligible;
    static String notLoggedInText;
    private boolean resultHandled;
    static int avatarTintStartColor;

    public static void releaseStaticReferences(int methodGuard) {
        int guardQuotient = -70 / ((methodGuard - 27) / 48);
        notLoggedInText = null;
    }

    final static void showLoggingInDialog(String loginIdentifier, byte methodGuard, boolean showLoginOnDismiss, String password) {
        try {
            TextTemplateLookupSupport.currentLoginIdentifier = loginIdentifier;
            LoginPasswordSupport.currentLoginPassword = password;
            int guardRemainder = -62 % ((13 - methodGuard) / 62);
            MessageDialogSupport.showMessageDialog(DisplayModeInfo.loggingInText, 480, showLoginOnDismiss);
        } catch (RuntimeException dialogFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dialogFailure), "r.E(" + (loginIdentifier != null ? "{...}" : "null") + ',' + methodGuard + ',' + showLoginOnDismiss + ',' + (password != null ? "{...}" : "null") + ')');
        }
    }

    private final void showCreationResult(boolean suppressIneligibleAction, UsernameAvailabilityQuery result, byte methodGuard) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        MessageDialogContent var5 = null;
        int var6 = 0;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          this.resultHandled = true;
          if (methodGuard > -21) {
            notLoggedInText = (String) null;
          }
          if (!result.accepted) {
            if (null == result.suggestedUsernames) {
              var4 = result.candidateOrFailureText;
              if (result.responseCode == 248) {
                if (!suppressIneligibleAction) {
                  AgeValidator.markAccountIneligibleAndMaybeRequestGameArchives(-65);
                }
                this.accountIneligible = true;
                var4 = DisplayNamePanel.createIneligibleText;
              }
            } else {
              var4 = ResourceArchive.createUsernameUnavailableText;
              if (null != this.accountForm) {
                this.accountForm.onMoreSuggestionsRequested((byte) 83);
              }
            }
          } else {
            var4 = ValidationState.createAccountSuccessText;
          }
          var5 = new MessageDialogContent((MessageDialog) (this), UiFontResources.commonUiBoldFont, var4);
          if (result.accepted) {
            if (result.underThirteenFlag) {
              this.replaceContent(new Under13TermsPanel((AccountCreationDialog) (this)), -111);
              return;
            }
            var5.appendButton(-2, UsernameQuerySupport.continueText, (WidgetListener) (this));
          } else {
            if (!this.accountIneligible) {
              if (result.responseCode == 5) {
                var5.appendActionButton(TriangleMesh.reloadGameText, 1, 11);
                var5.appendActionButton(DisplayModeInfo.quitToWebsiteText, 1, 17);
              } else {
                var5.appendActionButton(GameGraphicsResources.backText, 1, -1);
              }
            } else {
              var5.appendButton(-2, UsernameQuerySupport.continueText, (WidgetListener) (this));
            }
            if (result.responseCode == 3) {
              var5.appendActionButton(WidgetContainer.toServerListText, 1, 7);
            } else {
              if (6 == result.responseCode) {
                var5.appendActionButton(AvatarFeedbackSupport.toCustomerSupportText, 1, 9);
              }
            }
          }
          this.replaceContent(var5, -36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("r.G(").append(suppressIneligibleAction).append(',');
          if (result == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(methodGuard).append(')').toString());
        }
    }

    AccountCreationDialog(DialogLayer dialogLayer, AccountCreationForm accountForm) {
        super(dialogLayer, UiFontResources.commonUiBoldFont, KeyedIntRecordSubmission.creatingYourAccountText, false, false);
        try {
            this.accountForm = accountForm;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + (accountForm != null ? "{...}" : "null") + ')');
        }
    }

    final static TextValidationFailure validateEmailLocalPart(String localPart, boolean preserveNotLoggedInText) {
        TextValidationFailure emptyComponentFailureBeforeReturn = null;
        TextValidationFailure overlongComponentFailureBeforeReturn = null;
        TextValidationFailure missingClosingQuoteFailureBeforeReturn = null;
        int toggledEscapeState = 0;
        TextValidationFailure unescapedQuoteFailureBeforeReturn = null;
        TextValidationFailure invalidDotFailureBeforeReturn = null;
        TextValidationFailure invalidCharacterFailureBeforeReturn = null;
        Object nullSuccessBeforeReturn = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String localPartDescription = null;
        RuntimeException caughtValidationFailure = null;
        int localPartLength = 0;
        RuntimeException validationFailureForContext = null;
        int escapeOrPreviousDotState = 0;
        int characterIndex = 0;
        int characterCode = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          localPartLength = localPart.length();
          if (localPartLength == 0) {
            emptyComponentFailureBeforeReturn = InstrumentNoteMask.missingTextComponentFailure;
            return emptyComponentFailureBeforeReturn;
          }
          if (localPartLength > 64) {
            overlongComponentFailureBeforeReturn = ButtonWidget.overlongTextFailure;
            return overlongComponentFailureBeforeReturn;
          }
          if (34 == localPart.charAt(0)) {
            if (localPart.charAt(localPartLength - 1) != 34) {
              missingClosingQuoteFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
              return missingClosingQuoteFailureBeforeReturn;
            }
            escapeOrPreviousDotState = 0;
            for (characterIndex = 1; characterIndex < -1 + localPartLength; characterIndex++) {
              characterCode = localPart.charAt(characterIndex);
              if (characterCode == 92) {
                toggledEscapeState = (escapeOrPreviousDotState != 0) ? 0 : 1;
                escapeOrPreviousDotState = toggledEscapeState;
              } else {
                if ((characterCode == 34) &&
                    (escapeOrPreviousDotState == 0)) {
                  unescapedQuoteFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
                  return unescapedQuoteFailureBeforeReturn;
                }
                escapeOrPreviousDotState = 0;
              }
            }
            return null;
          }
          escapeOrPreviousDotState = 0;
          for (characterIndex = 0; characterIndex < localPartLength; characterIndex++) {
            unquotedLocalPartCharacter: {
              characterCode = localPart.charAt(characterIndex);
              if (characterCode == 46) {
                if ((0 != characterIndex) &&
                    (characterIndex != -1 + localPartLength) &&
                    (escapeOrPreviousDotState == 0)) {
                  escapeOrPreviousDotState = 1;
                  break unquotedLocalPartCharacter;
                }
                invalidDotFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
                return invalidDotFailureBeforeReturn;
              }
              if (StatefulWidgetRenderer.emailLocalPartCharacters.indexOf(characterCode) == -1) {
                invalidCharacterFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
                return invalidCharacterFailureBeforeReturn;
              }
              escapeOrPreviousDotState = 0;
            }
          }
          if (preserveNotLoggedInText) {
            return null;
          }
          notLoggedInText = (String) null;
          nullSuccessBeforeReturn = null;
          return (TextValidationFailure) (nullSuccessBeforeReturn);
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("r.B(");
          if (localPart == null) {
            localPartDescription = "null";
          } else {
            localPartDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(localPartDescription).append(',').append(preserveNotLoggedInText).append(')').toString());
        }
    }

    final void showIneligibleResult(int methodGuard) {
        this.showCreationResult(true, RankedComparisonSupport.createUsernameResponseQuery(DisplayNamePanel.createIneligibleText, 248, false), (byte) -57);
        if (methodGuard != 12086) {
            this.resultHandled = false;
        }
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        if ((this.accountIneligible)) {
            TextTemplateLookupSupport.openLoginPanel(true, false, false);
            return;
        }
        if (param1 != -20) {
            return;
        }
        try {
            SessionTextHistorySupport.prepareAccountCreationUi(-112);
            this.dismissDialog((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        UsernameAvailabilityQuery var2 = null;
        if (param0 != -1) {
            notLoggedInText = (String) null;
        }
        if ((this.dialogVisible) &&
            (!(this.resultHandled))) {
            var2 = MatchingTextValidator.pollAccountCreationUsernameResult((byte) 93);
            if ((var2 != null)) {
                this.showCreationResult(false, var2, (byte) -69);
            }
        }
        return super.advanceDialogAnimation(-1);
    }

    static {
        notLoggedInText = "You are not currently logged in to this service. To store your score, progress and any Achievements, you must log in or create an account.";
    }
}
